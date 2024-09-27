import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playerMove;
        int compCounter = 0;
        int playerCounter = 0;

        while (true) {
            System.out.println("Please enter your move (r, p or s). Enter q to quit:");
            playerMove = scanner.nextLine();

            if (playerMove.equals("q")) {
                System.out.println("Thanks for playing! Your score: " + playerCounter + "/" + compCounter);
                break;
            }

            if (!playerMove.equals("r") && !playerMove.equals("p") && !playerMove.equals("s")) {
                System.out.println(playerMove + " is not a valid move.");
                continue;
            }

            String computerMove = rps[random.nextInt(rps.length)];
            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game is a tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    compCounter++;
                    System.out.println("Computer wins! You lose! 😭");
                } else {
                    playerCounter++;
                    System.out.println("You win! 😎");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    playerCounter++;
                    System.out.println("You win! 😎");
                } else {
                    compCounter++;
                    System.out.println("Computer wins! You lose! 😭");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    compCounter++;
                    System.out.println("Computer wins! You lose! 😭");
                } else {
                    playerCounter++;
                    System.out.println("You win! 😎");
                }
            }

            System.out.println("Current score: You " + playerCounter + " - Computer " + compCounter);
        }

        scanner.close();
    }
}
