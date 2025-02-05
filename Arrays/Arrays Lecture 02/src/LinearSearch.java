//* GFG Link --> https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.Scanner;

public class LinearSearch {
  static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println("Linear Search in array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the value to be searched");
    int key = sc.nextInt();
    int index = linearSearch(arr, key);
    if (index == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index " + index);
    }
    sc.close();
  }
}
