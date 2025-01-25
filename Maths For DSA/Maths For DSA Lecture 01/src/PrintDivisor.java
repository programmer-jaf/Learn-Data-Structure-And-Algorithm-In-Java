import java.util.Scanner;
// GFG Link --> https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
// Naukri Link --> https://www.naukri.com/code360/problems/print-all-divisors-of-a-number_1164188?leftPanelTabValue=SUBMISSION
public class PrintDivisor {
  static void printDivisor(int n){
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {  // Check if i is a divisor
        System.out.print(i + " ");  // Print the divisor
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("Print Divisor problem");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    printDivisor(num);
    sc.close();
  }
}
