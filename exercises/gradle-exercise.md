# Gradle Exercise

You and a partner are going to create a Java application gradle project which will print integer sequences.  You will then push your project to GitHub and show me.  I recommend you start by creating a new GitHub repository!

The first integer sequence is the Triangle number sequence.  Think of this as an "additive" version of a factorial function: whereas 5! = 5 * 4 * 3 * 2 * 1, Tri(5) = 5 + 4 + 3 + 2 + 1.  You can find the exact equation here: https://en.wikipedia.org/wiki/Triangular_number

The second sequence is the Lazy Caterer sequence.  This is the sequence which indicates how many pieces a cake could be cut into by using n knife cuts.  For example, with 0 knife cuts, a cake would have to stay in one piece.  With two knife cuts, you could have four pieces.  You can find the equation governing the Lazy Caterer sequence here: https://en.wikipedia.org/wiki/Lazy_caterer%27s_sequence

The project should meet the following specifications:

1. A main class which accepts two arguments:
  1. The first argument shall consist of either the string "lazy" or "triangle".  If neither, the program shall inform the user and exit with error code 1.
  2. The second argument shall be a positive 32-bit integer.  If it is not, the program shall inform the user and exit with error code 2.
2. The program shall print out the result (the Lazy Caterer number or the Triangle number) in the following format: "Tri(n) = x" if the user selected a triangle number or "Lazy(n) = x" if the user selected a Lazy Caterer number.
3. At least three unit tests of each non-main method shall be added.  The minimum here is two methods (one to calculate triangle numbers and the other to calculate Lazy Caterer numbers).
4. Aside from the gradle commands "build", "run", and "test", an additional task, "sequencehelp", shall be added.  I should be able to run this command with `gradle -q sequencehelp` or `gradle sequencehelp` .  This task shall do the following (in Groovy):
  1. Print "Integer Sequence Project"
  2. Print a short help sequence showing how the program works (as described in the specifications above)

If you need to exit with an error, it is important to exit with a different error than 0, as 0 indicates success to gradle.  It will not know that your program has an error unless you indicate it with a non-zero exit code.  This is good advice not just for this class but in general - if your program exits abnormally, the way to indicate this is with some non-zero exit code.  Other programs which may depend on yours can use that as a "signal" from your program.

When complete, you should push up to GitHub and show me.  I may or may not clone it down to my computer to ensure that it works!