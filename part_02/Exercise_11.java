
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args)
            throws java.io.IOException {

        long investment;
        double rate;
        int years;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter valid investment amount:");
            investment = scan.nextLong();
        } while (investment < 1);

        do {
            System.out.println("Enter valid interest rate:");
            rate = scan.nextDouble();
        } while (rate > 1);

        do {
            System.out.println("Enter valid years");
            years = scan.nextInt();
        } while (years > 1);

            double numerator = Math.pow((1 + rate), years);
            System.out.println(investment + numerator / rate);



    }
}