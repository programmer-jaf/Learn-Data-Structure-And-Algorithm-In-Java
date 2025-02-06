import java.util.Scanner;

public class MethodOverLoading {
  // Example of Method Overloading
// Example 01:
  static int sumOfTwoNumber(int a, int b) {
    return (a + b);
  }

  static int sumOfTwoNumber(int a, int b, int c) {
    return (a + b + c);
  }

  // Example 02:
  static void greetings() {
    System.out.println("This is simple greeting...");
  }

  static void greetings(String name) {
    System.out.println("This is a simple greeting for " + name);
  }

  public static void main(String[] args) {
    System.out.println("Learn about Method Overloading...");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of b");
    int b = sc.nextInt();
    System.out.println("Enter the value of c");
    int c = sc.nextInt();
    int result1 = sumOfTwoNumber(a, b);
    System.out.println(result1);
    int result2 = sumOfTwoNumber(a, b, c);
    System.out.println(result2);
    greetings();
    String myName = "Programmer Jaf";
    greetings(myName);
    sc.close();
  }
}
