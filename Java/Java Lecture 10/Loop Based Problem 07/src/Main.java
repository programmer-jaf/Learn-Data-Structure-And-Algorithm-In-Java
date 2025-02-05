import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Sum of Digits ➕");
    System.out.println();
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      sum += rem;
      num = num / 10;
    }
    System.out.println("Sum: " + sum);
    sc.close();
  }
}
