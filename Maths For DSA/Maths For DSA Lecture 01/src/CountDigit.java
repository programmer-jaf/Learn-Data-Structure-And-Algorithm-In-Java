import java.util.Scanner;

// * Leetcode Link --> https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
public class CountDigit {
  static int countDigit(int num) {
    if (num == 0) {
      return 1;
    }
    int originalNum = num;
    num = Math.abs(num);
    int count = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      if (lastDigit != 0 && originalNum % lastDigit == 0) {
        count++;
      }
      num /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println("Count Digit problem");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    int result = countDigit(num);
    System.out.println("The Digit Count is " + result);
    sc.close();
  }
}
