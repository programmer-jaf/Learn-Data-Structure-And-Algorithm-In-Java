import java.util.Scanner;

public class smallestElement {
  static int findSmallest(int[] arr){
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]<smallest){
        smallest=arr[i];
      }
    }
    return smallest;
  }
  public static void main(String[] args) {
    System.out.println("Find the second largest element in an array");
    System.out.println("Find the largest element in an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int result = findSmallest(arr);
    System.out.println("The smallest element in an array "+result);
    sc.close();
  }
}
