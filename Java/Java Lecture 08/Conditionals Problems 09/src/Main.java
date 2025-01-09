import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Age Validator");
		System.out.println();
		System.out.println("Enter your Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age<18 && age >1){
			System.out.println("You are a minor 👦");
		}else if (age>=18 && age<60){
			System.out.println("You are an adult 👨");
		}else {
			System.out.println("Your age is not valid");
		}
		sc.close();
	}
}
