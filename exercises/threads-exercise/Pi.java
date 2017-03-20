import java.util.concurrent.atomic.*;
import java.util.concurrent.*;
import java.util.concurrent.ThreadLocalRandom;

public class Pi {

    // The shared total count.
    
    public static AtomicLong _count = new AtomicLong(0);

    // Another (less efficient) way of doing this is constantly
    // update the _total and _count.  We'll minimize synchronization
    // here in order to help performance.
    
    // public static AtomicLong _total = new AtomicLong(0);

    // Array of threads which we will start.  We don't know how
    // many are in here at this point.
    
    public Thread[] _threads;

    // Calculate 
    
    public void calculate(long numThreads, long numIters) {

	// We now know how many threads, so
	// Note that we can only create an int-sized array, so
	// we had to cast our long to (int)
	_threads = new Thread[(int) numThreads];

	// Note that we have a slight issue due to rounding
	// here if numIters is not evenly divisible by numThreads.
	// This should probably be fixed if we really cared about
	// accuracy.  But it won't make much of a difference
	// for large values.

	// Convert to final values so that lambda can use them.
	
	final long numItersFinal = numIters / numThreads;

	// Create threads
	
	for (int j = 0; j < _threads.length; j++) {

	    _threads[j] = new Thread(() -> {
		    int curIter = 0;
		    int localCount = 0;
		    while (curIter++ < numItersFinal) {
			// Generate random X and Y values from 0.0 to 1.0
			double x = ThreadLocalRandom.current().nextDouble(1);
			double y = ThreadLocalRandom.current().nextDouble(1);

			// Debug print statement
			// System.out.print("(" + x + "," + y + ")");

			// If x^2 + y^2 < 1, the point is INSIDE the circle
			if ((x * x + y * y) < 1) {
			    // in circle
			    
			    // AtomicLong way of doing it
			    // Note this REALLY slows down your code!
			    // This is due to MANY synchronizations
			    // _count.incrementAndGet();
			    localCount++;

			} else {
			    // out of circle
			    // Do nothing

			}
		    }

		    // In this case, we'll use an AtomicLong to avoid
		    // any data races.

		    // A different approach to avoid ANY synchronization
		    // issues is storing different elements in a
		    // results array (not sharing any state) and then
		    // adding all of the elements in the array after joining.

		    // However, this will only cause n accesses to the
		    // locked value (where n = number of threads) and so
		    // there's not much of a performance hit.
		    
		    _count.addAndGet(localCount);
		    
		});
	}

	// Remember all of the threads have been created but are not
	// yet running.  Start all threads in the array running below.
	
	for (int j = 0; j < _threads.length; j++) {
	    _threads[j].start();
	}

	// Now wait for all of them to finish before continuing.
	
	for (int j = 0; j < _threads.length; j++) {
	    try {
		_threads[j].join();
	    } catch (Exception ex) { }
	}

	// We already know the number of iterations, we sent in the value!
	
	long t = numIters; // _total.get();

	// Number of points inside the circle
	
	long c = _count.get();

	// Ratio = c / t.  Forcing floating-point arithmetic by
	// casting c as double (could cast t, as well, it's arbitrary)
	
	double r = ((double) c / t);

	// Print out results
	
	System.out.println("Total  = " + t);
	System.out.println("Inside = " + c);
	System.out.println("Ratio  = " + r);
	System.out.println("Pi     = " + (r * 4));


    }
    
    public static void main(String[] args) {

	// I do no error-checking here.  Proceed at your own risk.
	
	long numThreads = Long.parseLong(args[0]);
	long numIters = Long.parseLong(args[1]);

	// Avoiding doing anything static by creating a Pi object.
	
	Pi pi = new Pi();

	// Start calculating!
	
	pi.calculate(numThreads, numIters);
    }
}
