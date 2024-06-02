import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        String rock = "Rock";
        String paper = "Paper";
        String scissors = "Scissors";

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose one of the following: Rock | Paper | Scissors");
        System.out.print("Your choice: ");

        String playerChoice = scan.nextLine();
        String computerChoice;

        if (playerChoice.equals("r") || playerChoice.equals("rock")) {
            playerChoice = rock;
        } else if (playerChoice.equals("p") || playerChoice.equals("paper")) {
            playerChoice = paper;
        } else if (playerChoice.equals("s") || playerChoice.equals("scissors")) {
            playerChoice = scissors;
        } else {
            System.out.println("Invalid input. Try again.");
            return;
            // playerChoice = scan.nextLine();
        }

        Random randomMove = new Random();

        int computerChoiceNum = randomMove.nextInt(3);

        if (computerChoiceNum == 0) {
            computerChoice = rock;
        } else if (computerChoiceNum == 1) {
            computerChoice = paper;
        } else {
            computerChoice = scissors;
        }

        System.out.printf("The computer choice is: %s.%n", computerChoice);

        if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            System.out.println("You win.");
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Paper")) {
            System.out.println("You lose.");
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            System.out.println("You win.");
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            System.out.println("You lose.");
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            System.out.println("You lose.");
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            System.out.println("You win.");
        } else {
            System.out.println("This game was a draw.");
        }
    }

}