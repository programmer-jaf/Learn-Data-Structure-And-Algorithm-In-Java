import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Find Factorial");
		System.out.println();
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int fact = sc.nextInt();
		int factorial=1;
		for (int i = fact; i>0 ; i--) {
			factorial *=i;
		}
		System.out.println("The factorial of "+fact+" is "+factorial);
		sc.close();
	}
}
