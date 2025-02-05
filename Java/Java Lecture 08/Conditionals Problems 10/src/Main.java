import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("🎮 Rock, Paper, Scissors 🎮");
    System.out.println();

    Scanner sc = new Scanner(System.in);
    // Taking input for Player One
    System.out.print("Player One: ");
    String playerOne = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

    // Taking input for Player Two
    System.out.print("Player Two: ");
    String playerTwo = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

    // Logic to determine the winner
    if (playerOne.equals(playerTwo)) {
      System.out.println("🤝 It's a tie!");
    } else if (
        (playerOne.equals("rock") && playerTwo.equals("scissors")) ||
            (playerOne.equals("scissors") && playerTwo.equals("paper")) ||
            (playerOne.equals("paper") && playerTwo.equals("rock"))
    ) {
      System.out.println("🎉 Player One wins! 🏆");
    } else if (
        (playerTwo.equals("rock") && playerOne.equals("scissors")) ||
            (playerTwo.equals("scissors") && playerOne.equals("paper")) ||
            (playerTwo.equals("paper") && playerOne.equals("rock"))
    ) {
      System.out.println("🎉 Player Two wins! 🏆");
    } else {
      System.out.println("⚠️ Invalid input. Please enter Rock, Paper, or Scissors.");
    }

    sc.close(); // Close the scanner after all input is complete
  }
}
