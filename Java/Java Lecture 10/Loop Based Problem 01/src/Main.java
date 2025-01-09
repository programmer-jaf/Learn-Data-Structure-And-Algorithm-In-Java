import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Sum of N Natural Numbers ➕");
		System.out.println();
		System.out.println("Enter a Natural Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
		sc.close();
	}
}
