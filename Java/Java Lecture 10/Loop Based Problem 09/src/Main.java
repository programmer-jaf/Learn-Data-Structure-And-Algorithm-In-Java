import java.util.Scanner;

public class Main {
  static boolean isAmstrongNumber(int num) {
    int originalNumber = num;
    int sum = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      sum += (lastDigit * lastDigit * lastDigit);
      num /= 10;
    }
    return sum == originalNumber;
  }

  public static void main(String[] args) {
    System.out.println("Armstrong Number 💪");
    Scanner scanner = new Scanner(System.in);

    // Input the number
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    // Check if it's an Armstrong number
    if (isAmstrongNumber(number)) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }

    scanner.close();
  }
}
