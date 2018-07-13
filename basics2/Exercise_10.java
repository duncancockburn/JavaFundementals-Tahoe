package basics2;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main(String[] args) {
                int i;
                for (i = 1; i <= 100; i++){                 //loop numbers 1 through 100
                    boolean prime = true;                   //setting prime to be true
                    for (int x = i-1; x > 1; x--){          // loop through every number between i-1 and 2
                        if (i % x == 0){
                            prime = false;
                        }
                    }
                    if (prime){
                        System.out.println(i + " is prime.");
                    }
                }
            }
        }