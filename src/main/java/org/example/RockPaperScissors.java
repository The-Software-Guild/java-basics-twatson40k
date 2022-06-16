package org.example;
import java.util.Random;
import java.util.Scanner;
// Rock Paper Scissors code
public class RockPaperScissors {
    public static void main(String[] args) {
        int userWins;
        int progWins;
        int draws;
        int userSelect;
        int progSelect;
        //String userSelectStr;
        //String progSelectStr;
        int numRound;
        char result;
        char contPlay = 'y';
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        String userInput;

        // Start the game
        while (contPlay == 'y') {
            userWins = 0;
            progWins = 0;
            draws = 0;
            // How many rounds should we play?
            //while (numRound < 1 || numRound > 10) {
                System.out.print("how many rounds? ");
                userInput = in.nextLine();
                numRound = Integer.parseInt(userInput);
                // doesn't allow character inputs
            if (numRound < 1 || numRound > 10){
                System.out.print("Number must between 1 and 10");
                System.exit(0);
            }
           // }

            //Start the rounds
            for (int i = 1; i <= numRound; i++) {
                userSelect = 0;
                // Ask user for rps
                while (userSelect == 0) {
                    System.out.print("round " + i + ") What is your move, rock, paper, or scissors. ");
                    userInput = in.nextLine();
                    userSelect = userChoice(userInput);
                }

                // Get program rps
                progSelect = random.nextInt(3) + 1;
                // Get the result of this round
                result = whoWins(userSelect, progSelect);
                // record result
                if (result == 'U') userWins++;
                else if (result == 'P') progWins++;
                else draws++;

                System.out.println("score results: User: " + userWins + " Program: " + progWins + " Draws: " + draws);

                /*
                userSelectStr = intChoice(userSelect);
                progSelectStr = intChoice(progSelect);
                System.out.println("result = " + result);
                System.out.println("progSelect = " + progSelect);
                System.out.println("userSelect = " + userSelect);
                System.out.println("number of rounds = " + numRound);
                */
            }

            // Who has one?
            //System.out.println("score results: User: " + userWins + " Program: " + progWins + " Draws: " + draws);
            if (userWins > progWins) {
                System.out.println("User Wins");
            } else if (userWins < progWins) {
                System.out.println("Program Wins");
            } else {System.out.println("It's A Draw");}

            // continue playing?
            contPlay = 'n';
            System.out.println("Do you wish to continue (y/n)");
            userInput = in.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                contPlay = 'y';
            } else{
                System.out.println("Thanks for playing!");
            }

        } //end of game
    }



    public static int userChoice(String userSelect) {
        int result = 0;
        if (userSelect.equalsIgnoreCase("rock")){
            result = 1;
        } else if (userSelect.equalsIgnoreCase("paper") ){
            result = 2;
        } else if (userSelect.equalsIgnoreCase("scissors")){
            result = 3;
        }
        return result;
    }
        //char result = 'D';
    public static char whoWins(int userSelect, int progSelect) {
        char result = 'D';

        if (userSelect == 1)
        {
            if (progSelect == 2)
                result = 'U';
            else if (progSelect == 3)
                result = 'P';
        }

        else if (userSelect == 2)
        {
            if (progSelect == 3)
                result = 'U';
            else if (progSelect == 1)
                result = 'P';
        }

        else if (userSelect == 3)
        {
            if (progSelect == 1)
                result = 'U';
            else if (progSelect == 2)
                result = 'P';
        }
        return result;
    }
    /*public static String intChoice(int userInt) {
        //int result = 0;
        String displays = null;
        if (userInt == 1){
            displays = "ROCK";
        } else if (userInt == 2){
            displays = "PAPER";
        } else if (userInt == 3){
            displays = "SCISSORS";
        }
        return displays;
    }*/
}