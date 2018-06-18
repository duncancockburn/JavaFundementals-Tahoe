package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                System.out.println("One");
            } else {
                if (i == 2) {
                    System.out.println("Two");
                } else {
                    if (i > 2) {
                        System.out.println("Other");
                    }
                }
            }
        }
    }
}
