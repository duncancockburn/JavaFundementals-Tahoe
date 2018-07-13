package basics2;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main(String[] args)
            throws java.io.IOException {

        long miles;
        double mpg;
        double price;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter valid miles:");
            miles = scan.nextLong();
        } while (miles < 1);

        do {
            System.out.println("Enter valid mpg amount:");
            mpg = scan.nextDouble();
        } while (mpg < 1);

        do {
            System.out.println("Enter valid price:");
            price = scan.nextDouble();
        } while (price < 1);

        System.out.println(miles / mpg * price);
    }
}


