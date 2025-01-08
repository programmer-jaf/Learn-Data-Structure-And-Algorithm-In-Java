import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter current weather (sunny, rainy, snowy): ");
		Scanner sc = new Scanner(System.in);
		String weather = sc.nextLine().toLowerCase();
		if (weather.equals("sunny")) {
			System.out.println("Wear sunglasses");
		} else if (weather.equals("rainy")) {
			System.out.println("Bring an umbrella");
		} else if (weather.equals("snowy")) {
			System.out.println("Wear a coat");
		} else {
			System.out.println("Invalid weather");
		}
		sc.close();
	}
}
