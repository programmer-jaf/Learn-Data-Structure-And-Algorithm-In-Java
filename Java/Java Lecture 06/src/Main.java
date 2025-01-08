import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("learn about Inputs ");
//	! make sure add Scanner at the top
		Scanner sc = new Scanner(System.in);
//	byte
		System.out.println("Enter a byte value");
		byte byteValue = sc.nextByte();
		System.out.println("The Byte value is "+byteValue);
		
//	short
		System.out.println("Enter a short value");
		short shortValue = sc.nextShort();
		System.out.println("The Short value is "+shortValue);
//  int
		System.out.println("Enter a int value");
		int intValue = sc.nextInt();
		System.out.println("The int value is "+intValue);
//  long
		System.out.println("Enter a int value");
		long longValue = sc.nextLong();
		System.out.println("The int value is "+longValue);
//	boolean
		System.out.println("Enter a boolean value");
		boolean booleanValue = sc.nextBoolean();
		System.out.println("The boolean value is "+booleanValue);
//	char
		System.out.println("Enter a character");
		char a = sc.next().charAt(0);
		System.out.println("The character is "+a);
//	for nextLine
		System.out.println(sc.nextLine());
//  String
		System.out.println("Enter your name");
		String str = sc.nextLine();
		System.out.println("Your name is "+str);
//	make sure close the Scanner
		sc.close();
		
	}
}
