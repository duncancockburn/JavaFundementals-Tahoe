package basics;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        int km = 12;
        double d = km*1.6;
        double time = 30.5;
        int hour = 60;
        double th = hour/time;
        double answer = d * th;

        System.out.println(answer);
    }


}
