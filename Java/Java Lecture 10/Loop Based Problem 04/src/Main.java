import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("count digits");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits: " + count);
		sc.close();
	}
}
