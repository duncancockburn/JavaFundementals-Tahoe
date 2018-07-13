package basics2;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            switch (i) {
                case (1):
                    System.out.println("one");
                    break;

                case (2):
                    System.out.println("two");
                    break;

                default:
                    System.out.println("Other");
            }

        }

    }
}