import java.util.Scanner;
// Leetcode Link --> https://leetcode.com/problems/palindrome-number/submissions/1519672657/
// GFG Link --> https://www.geeksforgeeks.org/problems/palindrome0746/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class PalindromeNumber {
  static boolean isPalindrome(int num) {
    int rev = 0;
    int originalNum = num;
    while (num > 0) {
      int lastDigit = num % 10;
      rev = (rev * 10) + lastDigit;
      num /= 10;
    }
    return originalNum == rev;
  }
  public static void main(String[] args) {
    System.out.println("Palindrome number problem");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    boolean result = isPalindrome(num);
    System.out.println("The Palindrome number is " + result);
    sc.close();
  }
}
