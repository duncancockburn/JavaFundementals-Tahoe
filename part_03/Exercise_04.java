package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings)
            throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");


        //create int variable "playerHand" that takes user input
        Scanner scan = new Scanner(System.in);
        int playerHand = scan.nextInt();
        //create int variable "computerHand" that generates a random number 0-2
        int computerHand = (int)(Math.random()*0+2);

        //call the getHand method for the playerHand
        String playerString = getHand(playerHand);

        //call the getHand method for the computerHand
        String computerString = getHand(computerHand);

        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand
         String winner = determineWinner(computerHand,playerHand);

        //print out the player hand and computer hand
        System.out.println(playerHand);
        System.out.println(computerHand);

        //print out the winner
        System.out.println(winner);

    }

    // getHand method
    public static String getHand(int hand){

        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper

        String handString = "";

        switch (hand){
            case (0):
                handString = ("scissor");
                break;
            case(1):
                handString = ("rock");
                break;
            default:
                handString = ("paper");

        }


        //this is a temporary return statement to squash error - you'll need to update
        return handString;
    }





    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computer, int player) {

        String status = "Idle";
        if( computer != player){
            switch (player){
                case 0:
                    status = (computer != 1) ? "you won" : "you lost:(";
                    break;

                case 1:
                    status = (computer != 2) ? "you won" : "you lost:(";
                    break;

                default:
                    status = (computer != 0) ? "you won" : "you lost:(";

            }
        }
        // determine if the game is a tie

        // if it is not a tie, use a switch statement and a turnery operator to determine the winner


        return status;

    }
}





