package subclasses;

/**
 * Demonstrate how variable-arity works, aka varargs.
 *
 * Create a method that uses "String ... varargs".
 *
 * Within the varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs.
 *
 * Print this statement to the console. Do this at least 3 times with different Strings/sentences.
 */


class Example9{

    public static void sayHello(String... names) {
        for (String n : names) {


            // creates empty builder, capacity 16
            StringBuilder sb = new StringBuilder();
            // adds 9 character string at beginning
            sb.append("Greetings ");


            System.out.println(sb + n);

        }
    }

    public static void main(String[] args) {
        sayHello("Paul", "Sue");
    }

}


