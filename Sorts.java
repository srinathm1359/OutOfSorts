import java.util.Arrays;
public class Sorts{
  public static void swap(int[] array, int a) {
    if (a >= 0 && a+1 < array.length) {
      if (array[a] > array[a+1]) {
        int store = array[a];
        array[a] = array[a+1];
        array[a+1] = store;
      }
    }
  }
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {

  }

  public static void main(String[] args) {
    int[] array = {9,8,7,6,5,4,3,2,1,0};
    for (int i = 0; i < array.length - 1; i++) {
      swap(array, i);
      System.out.println(Arrays.toString(array));
    }
  }
}
