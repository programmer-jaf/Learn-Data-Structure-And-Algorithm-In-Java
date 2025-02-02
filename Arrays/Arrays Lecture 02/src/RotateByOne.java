import java.util.Scanner;
// Nauki Link --> https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278?leftPanelTabValue=SUBMISSION
public class RotateByOne {

  public static int[] leftRotateByOne(int[] arr, int n) {
    if (arr == null || arr.length == 0) return arr; // Handle edge case

    int firstElement = arr[0]; // Store the first element
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i]; // Shift elements left
    }
    arr[arr.length - 1] = firstElement; // Place first element at the end

    return arr;
  }

  public static void main(String[] args) {
    System.out.println("Left rotation of an array by one");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    arr = leftRotateByOne(arr, size);

    // Print rotated array
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}