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

  /* public static void main(String[] args) {
    int[] array = {9,8,7,6,5,4,3,2,1,0};
    for (int i = 0; i < array.length - 1; i++) {
      swap(array, i);
      System.out.println(Arrays.toString(array));
    }
    int[] array2 = {10,11,13,8,4,16};
    bubbleSort(array2);
    System.out.println(Arrays.toString(array2));
    int[] sortedArray = {1,2,3,4,5,6};
    bubbleSort(sortedArray);
    System.out.println(Arrays.toString(sortedArray));
    int[] almostSorted = {1,2,3,4,6,5};
    bubbleSort(almostSorted);
    System.out.println(Arrays.toString(almostSorted));
  } */
}
