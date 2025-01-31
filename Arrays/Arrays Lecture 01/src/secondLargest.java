import java.util.Scanner;
// GFG Link --> https://www.geeksforgeeks.org/problems/second-largest3735/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class secondLargest {
  static int findLargest(int[] arr){
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (largest<arr[i]) largest=arr[i];
    }
    return largest;
  }
  static int findSecondLargest(int[] arr){
    int largest = findLargest(arr);
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>secondLargest && arr[i]!=largest) secondLargest=arr[i];
    }
    return secondLargest;
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
    int result = findSecondLargest(arr);
    System.out.println("The second Largest element is "+result);
    sc.close();
  }
}
