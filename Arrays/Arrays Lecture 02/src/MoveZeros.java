// Leetcode Link --> https://leetcode.com/problems/move-zeroes/submissions/1528535803/
// GFG Link --> https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
import java.util.Scanner;

public class MoveZeros {
  public static void moveZeros(int[] arr) {
    int j = 0; // Pointer for placing non-zero elements

    // Traverse the array
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        // Swap arr[i] with arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++; // Move j forward
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("Move zeros to the end of an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    moveZeros(arr);
    // Print rotated array
    for (int num : arr) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}
