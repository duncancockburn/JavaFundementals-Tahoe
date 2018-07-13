package basics2;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {
    public static void main(String[] args)
            throws java.io.IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of pounds");

        double p = (double) System.in.read();

        System.out.println(p*0.454);


    }
}