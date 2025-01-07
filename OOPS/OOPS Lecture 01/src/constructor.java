public class constructor {
	// create a class
//	default-constructor
	public static class DefaultConstructor {
		int num = 10;
	}
	
	//	constructor-overloaded
	public static class ParameterizedConstructor {
		public ParameterizedConstructor(String name) {
			System.out.println("Hey,👋 It's " + name);
		}
		
		public static void main(String[] args) {
			System.out.println("learn about constructor");
//	create objects
			DefaultConstructor constructor = new DefaultConstructor(); //  DefaultConstructor(); --> This is default constructor
//  call overloaded-constructor
			ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor("Jaf");
		}
	}
}
