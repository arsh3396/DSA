package may23;

import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {

        playGame();
    }

    static void playGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        int guess = 0;

        while (true) {
            System.out.print("Enter Number: ");
            int userInput = sc.nextInt();

            if (userInput == randomNum) {
                System.out.println("You have guess the number in " + ++guess + " attempts");
                break;
            }
            else if (userInput < randomNum) {
                System.out.println("Too low");
            }
            else {
                System.out.println("Too high");
            }
            guess++;
        }
    }
}
