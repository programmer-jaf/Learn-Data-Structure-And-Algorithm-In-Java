import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Temperature Checker");
		System.out.println();
		System.out.println("Enter the temperature: ");
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		if (temperature>30){
			System.out.println("🔥 It is hot outside");
		} else if (temperature<10) {
			System.out.println("❄️ It is cold outside");
		}else{
			System.out.println("🌥 It's pleasant outside");
		}
		sc.close();
	}
}
