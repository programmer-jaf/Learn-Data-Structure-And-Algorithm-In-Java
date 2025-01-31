public class Arrays {
  public static void main(String[] args) {
//  What is an array?
//  Ans: Array is a data-structure to store similar types of data.
//  initialization
//  Way 01:
    int[] shortArray;
//  Way 02:
    int[] array = new int[10];
//  traversing an array
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+" ");
    }
//  using for-each loop
    for (int i : array){
      System.out.println(i);
    }
  }
}
