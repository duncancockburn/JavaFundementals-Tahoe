package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class readandprint{
    public static void main(String[] args)
        throws java.io.IOException{

        int[] firstTen = new int[10];                                          //create an array
        Scanner scan = new Scanner(System.in);                               //creating the input

        for(int i = 0; i<10; i++){                                               //looping around 1 to 10
            System.out.println("Please enter the " + (i+1) + " number" );      //printing out the start
            firstTen[i] = scan.nextInt();                                       //printing the values into the array
        }

        for(int i = 1; i <firstTen.length; i+=2){
            System.out.println(firstTen[i]);
        }

        for(int i = firstTen.length-2; i>=1; i-=2){
            System.out.println(firstTen[i]);
        }



    }
}
