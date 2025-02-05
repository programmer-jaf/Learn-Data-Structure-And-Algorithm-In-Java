public class Main {
  public static void main(String[] args) {
    System.out.println("learn about loop");
//	! What is loop?
//	* Ans : loop is a block of code which run continuously until it will reach a specific condition
// There are 3 types of loop in java
//	for
/*
	* Syntax of for loop
	for(initialization,condition,updation){
	* code
	}
 */
    for (int i = 0; i < 11; i++) {
      System.out.print(i + " ");
    }
//	while
    System.out.println("using while loop");
    int num = 0;
    while (num < 11) {
      System.out.println(num);
      num++; // Post Increment
//	! make sure variable must be increment if you don't increment then it will be an infinite loop
    }
//	do-while
    System.out.println("using do while loop");
    int num2 = 0;
    do {
      System.out.print(num2 + " ");
      num2++;
    } while (num2 < 11);
  }
}
