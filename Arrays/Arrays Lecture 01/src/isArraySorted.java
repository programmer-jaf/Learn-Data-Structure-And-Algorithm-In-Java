import java.util.Scanner;
// GFG Link --> https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
public class isArraySorted {
  static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false; // Found an unsorted pair
      }
    }
    return true; // If no unsorted pair is found, the array is sorted
  }

  public static void main(String[] args) {
    System.out.println("Check if the array is sorted or not");
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    boolean result = isSorted(arr);
    System.out.println("The array is sorted: " + result);

    sc.close();
  }
}
