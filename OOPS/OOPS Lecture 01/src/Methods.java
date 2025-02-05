public class Methods {
  // ! What is method ?
// * ans : method is a block of code which perform a specific task when it called.
  public static class Man {
    // This is method
    static void sayHello() {
      System.out.println("👋 hello, this is 👨");
    }

    // method over-loading
    static void sayHello(String name) {
      System.out.println("👋 hello, this is 👨 " + name);
    }
  }

  public static void main(String[] args) {
    System.out.println("learn about methods and methods over-riding");
    Man me = new Man();
//	access-methods
//	Default-method
    Man.sayHello();
//	Overloaded-method
    Man.sayHello("Jaf");
  }
}
