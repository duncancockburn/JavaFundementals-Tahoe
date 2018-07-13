package basics2;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args)
        throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of minutes between 0 and 1000000000");
        int minutes = scan.nextInt();
        int year = minutes / (24*60*365);
        System.out.println(year);
        double mod = minutes % (24*60*365);
        System.out.println(mod);
        double a = (mod*60*24);
        System.out.println(a);

        //gives the number of years. now need to work out days which will be remainder * 365
 //           long remainder = (year*356*24*60) % minutes;
 //           System.out.println(remainder);
   //
     //       long days = remainder/(365*24);
       //     System.out.println("this is " + year + "years and" + days + "days");
    }
}


