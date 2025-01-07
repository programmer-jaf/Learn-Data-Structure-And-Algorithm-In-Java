public class Main {
	//	! What is class ?
//	* ans : class is a user defined-blueprint with some attributes and behaviors.
// 	! What is an Object ?
//	* ans : Object is an instance of a class.
// ! how to create a class
// * answer
// * make sure class-name must be capital
	public static class Animal{
		int legs = 4;
		int eye = 2;
//	add behaviors
//	* This is a method
//	! What is Method ?
//	* ans : Method/Function is a block of code which perform a specific task
		void walk(){
			System.out.println("Animal 🐶 is walking...");
		}
	}
	public static void main(String[] args) {
		System.out.println("learn about classes and Objects");
//	* create an Object
	Animal dog = new Animal();
// ? Access properties
		int eyes = dog.eye;
		System.out.println("Dog have "+eyes+" eyes");
//  call animal behaviors
		dog.walk();
	}
}
