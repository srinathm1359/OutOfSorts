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

  public static void swap(int[] array, int a, int b) {
    if (a > b) {
      if (array[b] > array[a]) {
        int store = array[b];
        array[b] = array[a];
        array[a] = store;
      }
    }
    if (a < b) {
      if (array[b] < array[a]) {
        int store = array[b];
        array[b] = array[a];
        array[a] = store;
      }
    }
  }
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    boolean swapped = true;
    int counter = data.length - 1;
    int swapCount = 0;
    while (swapped == true && counter > 0) {
      for (int i = 0; i < counter; i++) {
        if (data[i] > data[i+1]) {
          swapCount++;
        }
        swap(data, i);
      }
      if (swapCount == 0) {
        swapped = false;
      }
      swapCount = 0;
      counter--;
    }
  }


}
