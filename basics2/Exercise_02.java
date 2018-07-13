package basics2;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args)
        throws java.io.IOException {

        System.out.println("Enter the radius");
        double r = (double) System.in.read();
        double p = 3.1415;

        System.out.println(r*r*p);



        }
    }


