import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Discount Calculator program");
    System.out.println("Enter the total amount of the purchase: ");
    Scanner sc = new Scanner(System.in);
    int totalAmount = sc.nextInt();
    if (totalAmount > 100) {
      System.out.println("You have a 10% discount");
      System.out.println("Total amount after discount: " + (totalAmount - totalAmount * 0.1));
    } else {
      System.out.println("You have no discount");
      System.out.println("Total amount: " + totalAmount);
    }
  }
}
