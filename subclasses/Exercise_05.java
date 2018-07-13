package subclasses;

/**
 * Write one class.
 * This class must have two methods, a main() + a recursive method.
 * The recursive method must take in an integer as a parameter.
 *
 * The recursive method must then print out "Hello Recursion!" as many times as the "initial" input parameter dictates.
 *
 * For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 *
 */

class recursionExample{
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static String factorial(int n) {

        if (n == 1) return "Hello Recursion!";
        return "Hello Recursion!" + factorial(n-1);

    }


    }