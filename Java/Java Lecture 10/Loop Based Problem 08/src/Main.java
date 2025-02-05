import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("GCD - Greatest Common Divisor");

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter number a: ");
      int a = sc.nextInt();

      System.out.print("Enter number b: ");
      int b = sc.nextInt();

      if (a < 0 || b < 0) {
        System.out.println("Please enter non-negative integers.");
        return;
      }

      int originalA = a; // For better output formatting
      int originalB = b;

      // Calculate GCD using the Euclidean algorithm
      while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
      }

      System.out.println("GCD of " + originalA + " and " + originalB + " is: " + a);
    } catch (Exception e) {
      System.out.println("Invalid input! Please enter valid integers.");
    }
    // Close the Scanner to release resources
  }
}
