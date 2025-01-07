public class Main {
	public static void main(String[] args) {
		System.out.println("learn about arithmetic operators");
		
/* *There are 5 types of operators in java
	1. assignment operators
	2. arithmetic operators
	3. relational operators
	4. conditional operators
	5. bitwise operators
*/
//	assignment operator

//	equals t0 (=)
		int num = 10;
		
//	plus equals t0 (+=)
		num = num + 10; // long-hand
		num+=10; // short-hand
//	minus equals t0 (-=)
		num  = num - 10; // long-hand
		num  += 10; // short-hand
		System.out.println(num);
		
//	multiply equals t0 (*=)
		num = num * 10;
		num*=10;
		System.out.println(num);
		
//	divided equals t0 (/=)
		num = num / 10;
		num /=10;
		System.out.println(num);
		
//	modulo equals t0 (%=)
		num = num % 3;
		num%=3;
		System.out.println(num);
		
//	arithmetic operator

//	plus (+)
		int addition = (5+3);
		System.out.println(addition);
//	minus (-)
		int subtraction = (5-3);
		System.out.println(subtraction);
//	multiply (*)
		int multiplication = (5*3);
		System.out.println(multiplication);
//	division (/)
		int division = (5/3);
		System.out.println(division);
//	modulo (%)
		int modulo = (5%3);
		System.out.println(modulo);

//	relational operator
//	(>)
		boolean greaterThan = (5>3);
		System.out.println(greaterThan);
//	(>=)
		boolean greaterThanOrEquals = (5>=3);
		System.out.println(greaterThanOrEquals);
//	(<)
		boolean lessThan = (5<3);
		System.out.println(lessThan);
//	(<=)
		boolean lessThanOrEquals = (5<=3);
		System.out.println(lessThanOrEquals);
//	(==)
		boolean equalsTo = (5==3);
		System.out.println(equalsTo);
//	(!=)
		boolean notEqualsTo = (5!=3);
		System.out.println(notEqualsTo);
		
//	conditional operator
//	and (&&) --> if both condition becomes true then it will be executed
		int youAge = 18;
		int drivingExperience = 10;
		System.out.println((youAge==18 && drivingExperience==10));
//	or (||) --> if any condition becomes true then it will be executed
		int myAge  = 18;
		int DrivingExperience = 10;
		System.out.println((myAge ==18 || DrivingExperience==9));
//  Not (!) --> convert true to false and false to true
		System.out.println(!(false));

//	bitwise operator


// bitwise-and (&)
		int bitwiseNumOne = 5; // 0101
		int bitwiseNumTwo = 7; // 0111
//	?	ans =========================
// *                         (0101) = 5 // output
		System.out.println(bitwiseNumOne & bitwiseNumTwo);
// bitwise-or (|)
		bitwiseNumOne = 5; // 0101
		bitwiseNumTwo = 7; // 0111
//	?	ans =========================
// *                      0111 = 7 // Output
		System.out.println(bitwiseNumOne | bitwiseNumTwo);
	}
}