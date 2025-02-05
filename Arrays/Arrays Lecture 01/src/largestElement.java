import java.util.Scanner;

// GFG Link --> https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
// Naukri Link --> https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279
public class largestElement {
  static int findLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (largest < arr[i]) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    System.out.println("Find the largest element in an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int result = findLargest(arr);
    System.out.println("The largest element is " + result);
    sc.close();
  }
}
