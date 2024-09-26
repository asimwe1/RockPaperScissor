import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		
		
		
		String[] rps = {"r", "p", "s"};
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String playerMove = "";

		
		while (true) {
			if (playerMove.equals("q")) {
				System.out.println("Thanks for playing see ya.");
				break;
			}
			
			else {
				String computerMove = rps[random.nextInt(rps.length)];
				
				while (true) {
					System.out.println("Please enter your move(r, p or s) remember to enter q to quit");
					playerMove = scanner.nextLine();
					
					if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s") || playerMove.equals("q")) {
						break;
					}
					System.out.println(playerMove + "is not a valid move.");
				}
				
				System.out.println("Computer played: " + computerMove);
				
				if (playerMove.equals(computerMove)) {
					System.out.println("the game is a tie!");
				}
				else if (playerMove.equals("r")) {
					if (computerMove.equals("p")) {
						System.out.println("Computer Wins, You lose😭😭!");
					}
					else if (computerMove.equals("s")) {
						System.out.println("You win!😎");
					}
				}
				else if (playerMove.equals("p")) {
					if (computerMove.equals("r")) {
						System.out.println("you win!😎");
					}
					else if (computerMove.equals("s")) {
						System.out.println("You lose😭😭!");
					}
				}
				else if (playerMove.equals("s")) {
					if (computerMove.equals("r")) {
						System.out.println("You lose😭😭!");
					}
					else if(computerMove.equals("p")) {
						System.out.println("you win!😎");
					}
				}
			}
			
		}
		
		
	}

}
