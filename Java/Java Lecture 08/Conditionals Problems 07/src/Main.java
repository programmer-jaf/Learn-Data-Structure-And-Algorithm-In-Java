import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Guess the Animal program");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an animal name: Dog 🐶,cat 🐈,rabbit 🐰");
    String animal = sc.nextLine();
    if (animal.equals("Dog")) {
      System.out.println("You have selected Dog 🐶");
    } else if (animal.equals("cat")) {
      System.out.println("You have selected cat 🐈");
    } else if (animal.equals("rabbit")) {
      System.out.println("You have selected rabbit 🐰");
    } else {
      System.out.println("Invalid animal name");
    }
    sc.close();
  }
}
