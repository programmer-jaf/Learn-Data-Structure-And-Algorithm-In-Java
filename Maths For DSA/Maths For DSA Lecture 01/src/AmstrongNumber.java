import java.util.Scanner;
// GFG Link --> https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class AmstrongNumber {
  static boolean amstrong(int num) {
    int originalNum = num;
    int sum = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      sum = sum + (lastDigit * lastDigit * lastDigit);
      num /= 10;
    }
    return sum == originalNum;
  }
  public static void main(String[] args) {
    System.out.println("Amstrong Number problem");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    boolean result = amstrong(num);
    System.out.println("The Amstrong Number is " + result);
    sc.close();
  }
}
