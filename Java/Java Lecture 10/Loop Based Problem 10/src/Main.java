import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the number
    System.out.print("Enter a number to check if it belongs to the Fibonacci series: ");
    int number = scanner.nextInt();

    // Check if the number is a Fibonacci number
    if (isFibonacci(number)) {
      System.out.println(number + " is a Fibonacci number.");
    } else {
      System.out.println(number + " is not a Fibonacci number.");
    }
    scanner.close();
  }

  // Function to check if a number is a Fibonacci number
  public static boolean isFibonacci(int n) {
    // Check the two conditions for Fibonacci numbers
    return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
  }

  // Function to check if a number is a perfect square
  public static boolean isPerfectSquare(int num) {
    int sqrt = (int) Math.sqrt(num);
    return sqrt * sqrt == num;
  }
}
