public class Arrays {
  public static void main(String[] args) {
//  What is an array?
//  Ans: Array is a data-structure to store similar types of data.
//  initialization
//  Way 01:
    int[] shortArray;
//  Way 02:
    int[] array = new int[10];
    array[0] = 1254;
//  traversing an array
    for (int j : array) {
      System.out.print(j + " ");
    }
//  using for-each loop
    for (int i : array) {
      System.out.println(i);
    }
  }
}
