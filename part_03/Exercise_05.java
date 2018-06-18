package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings)
            throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999

        Scanner scan = new Scanner(System.in);
        System.out.println("Print a number betwen 1 and 1m");
        int a = scan.nextInt();

        if((a<1) || (a>100000000)){
            System.out.println("Please read instructions");
        } else{
            System.out.println("all good");}



        // use the && operator to see if the user's number is divisible by both 4 and 7
        if((a%4==0) &&(a%7==0)){
        System.out.println("Yes");}
        else {
            System.out.println("no");}

        // use the || operator to see if the user's number is divisible by 4 or 7
        if((a%4==0) || (a%7==0)){
            System.out.println("Yes");}
        else {
            System.out.println("no");}

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if((a%4==0) ^ (a%7==0)){
            System.out.println("Yes");}
        else {
            System.out.println("no");}



        // print out the results

    }
}


