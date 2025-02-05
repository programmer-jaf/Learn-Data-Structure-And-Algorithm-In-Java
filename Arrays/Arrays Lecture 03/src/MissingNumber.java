//* Leetcode Link --> https://leetcode.com/problems/missing-number/

import java.util.Scanner;

public class MissingNumber {
  static int findMissingNumber(int[] nums) {
    int n = nums.length;
    int actualSum = 0;
    for (int num : nums) {
      actualSum += num;
    }
    int sum = n * (n + 1) / 2;
    return sum - actualSum;
  }

  public static void main(String[] args) {
    System.out.println("Find the missing number in an array");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int result = findMissingNumber(arr);
    System.out.println("The missing number is " + result);
    sc.close();
  }
}

