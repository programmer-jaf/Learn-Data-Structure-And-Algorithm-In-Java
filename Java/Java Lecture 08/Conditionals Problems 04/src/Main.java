import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Even or Odd program");
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		sc.close();
	}
}
