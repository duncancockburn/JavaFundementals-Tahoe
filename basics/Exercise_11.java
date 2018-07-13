package basics;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        long p = 380123456;
        // how many seconds are there in 3 years
        long s = (3*365*24*60*60);
        //what happens on average every 4 seconds
        //every 12 seconds 1 person comes and every 40 seconds one leaves
        //work out the number of people coming every 3 years as a
        long a = s/12;
        long b = s/40;
        long answer = (p + a - b);
        System.out.println(answer);
    }
}
