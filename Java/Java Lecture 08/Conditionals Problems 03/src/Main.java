import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Grade Evaluation program");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your grade: ");
    int grade = sc.nextInt();

    if (grade >= 90 && grade <= 100) {
      System.out.println("A");
    } else if (grade >= 80 && grade < 90) {
      System.out.println("B");
    } else if (grade >= 70 && grade < 80) {
      System.out.println("C");
    } else if (grade >= 60 && grade < 70) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}