import java.util.Scanner;

// GFG Link --> https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class secondSmallest {
  static int findSmallest(int[] arr) {
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    return smallest;
  }

  static int findSecondSmallest(int[] arr) {
    int smallest = findSmallest(arr);
    int secondsmallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < secondsmallest && arr[i] != smallest) {
        secondsmallest = arr[i];
      }
    }
    return secondsmallest;
  }

  public static void main(String[] args) {
    System.out.println("Find the second smallest element in an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int result = findSecondSmallest(arr);
    System.out.println("The second smallest value is " + result);
    sc.close();
  }
}
