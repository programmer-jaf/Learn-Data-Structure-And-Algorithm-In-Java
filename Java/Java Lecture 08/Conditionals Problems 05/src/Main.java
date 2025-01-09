import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Emoji Fruit Picker");
		System.out.println("Enter a fruit emoji:");
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		if (fruit.equals("🍎")) {
			System.out.println("You have selected Apple 🍎");
		} else if (fruit.equals("🍌")) {
			System.out.println("You have selected Banana 🍌");
		} else if (fruit.equals("🍒")) {
			System.out.println("You have selected Cherry 🍒");
		} else {
			System.out.println("Invalid fruit emoji");
		}
	sc.close();
	}
}
