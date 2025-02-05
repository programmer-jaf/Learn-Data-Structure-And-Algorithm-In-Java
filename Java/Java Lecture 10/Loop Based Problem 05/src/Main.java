import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Multiplication Table");
    System.out.println();
    System.out.println("Enter the table number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + " = " + num * i);
    }
    sc.close();
  }
}
