import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerAChoice, playerBChoice;
        String playAgain;

        do {
            // Get a valid move from Player A
            playerAChoice = getValidMove(scanner, "Player A");

            // Get a valid move from Player B
            playerBChoice = getValidMove(scanner, "Player B");

            // Display the results
            System.out.println("\nPlayer A chose: " + playerAChoice);
            System.out.println("Player B chose: " + playerBChoice);

            // Determine the winner
            determineWinner(playerAChoice, playerBChoice);

            // Prompt the user to play again
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
        } while (playAgain.equals("Y"));

        scanner.close();
    }

    // Method to get a valid move from the player
    private static String getValidMove(Scanner scanner, String player) {
        String move;
        while (true) {
            System.out.print(player + ", enter your move (R for Rock, P for Paper, S for Scissors): ");
            move = scanner.nextLine().toUpperCase();
            if (move.equals("R") || move.equals("P") || move.equals("S")) {
                break; // valid input
            } else {
                System.out.println("Invalid move. Please enter R, P, or S.");
            }
        }
        return move;
    }

    // Method to determine the winner
    private static void determineWinner(String playerAChoice, String playerBChoice) {
        if (playerAChoice.equals(playerBChoice)) {
            System.out.println("It's a Tie!");
        } else if ((playerAChoice.equals("R") && playerBChoice.equals("S")) ||
                   (playerAChoice.equals("P") && playerBChoice.equals("R")) ||
                   (playerAChoice.equals("S") && playerBChoice.equals("P"))) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
