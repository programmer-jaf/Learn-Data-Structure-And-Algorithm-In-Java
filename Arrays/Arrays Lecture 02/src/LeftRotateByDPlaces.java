// GFG Link --> https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

import java.util.Scanner;

public class LeftRotateByDPlaces {

  public static void leftRotateByDPlaces(int[] arr, int d) {
    int n = arr.length;
    if (n < 2 || d % n == 0) return;
    d = d % n; // Handle cases where d > n

    // Reverse first d elements
    reverse(arr, 0, d - 1);
    // Reverse remaining n-d elements
    reverse(arr, d, n - 1);
    // Reverse entire array
    reverse(arr, 0, n - 1);
  }

  // Helper function to reverse array from index start to end
  private static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    System.out.println("left rotation of an array by d places");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the value of d");
    int d = sc.nextInt();
    leftRotateByDPlaces(arr, d);
    // Print rotated array
    for (int num : arr) {
      System.out.print(num + " ");
    }
    sc.close();
  }
}
