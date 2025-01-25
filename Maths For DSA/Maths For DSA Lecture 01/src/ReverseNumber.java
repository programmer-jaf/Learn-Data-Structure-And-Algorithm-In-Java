import java.util.Scanner;
// GFG Link --> https://www.geeksforgeeks.org/problems/reverse-digit0316/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class ReverseNumber {
  static int reverse(int num) {
    int rev =0;
    while (num > 0) {
      int lastDigit = num % 10;
      rev = (rev * 10) + lastDigit;
      num /= 10;
    }
    return rev;
  }
  public static void main(String[] args) {
    System.out.println("Reverse Number problem");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    int result = reverse(num);
    System.out.println("The Reverse Number is " + result);
    sc.close();
  }
}
