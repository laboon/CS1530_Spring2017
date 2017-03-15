import java.util.*;



public class Hashing {

    public HashMap _hashmap = new HashMap();

    public Hashtable _hashtable = new Hashtable();

    public int counter = 0;
    
    public static void main() {
	Thread t1 = new Thread(() -> {
		for (int j = 0; j < 100; j++) {
		    _hashmap.add(j, "monkey");
		}
	    });

	Thread t2 = new Thread(() -> {
		for (int j = 0; j < 100; j++) {
		    _hashmap.add(j, "monkey");
		}		
	    });

			       
    }
}
