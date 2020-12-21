import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[] array = {9,8,7,6,5,4,3,2,1,0};
    for (int i = 0; i < array.length - 1; i++) {
      Sorts.swap(array, i);
      System.out.println(Arrays.toString(array));
    }
    //Test bubbleSort
    System.out.println("Testing bubbleSort");
    int[] array2 = {10,11,13,8,4,16};
    Sorts.bubbleSort(array2);
    System.out.println(Arrays.toString(array2));
    int[] sortedArray = {1,2,3,4,5,6};
    Sorts.bubbleSort(sortedArray);
    System.out.println(Arrays.toString(sortedArray));
    int[] almostSorted = {1,2,3,4,6,5};
    Sorts.bubbleSort(almostSorted);
    System.out.println(Arrays.toString(almostSorted));
    //Test selectionSort
    System.out.println("Testing selectionSort");
    int[] array3 = {10,11,13,8,4,16};
    Sorts.selectionSort(array3);
    System.out.println(Arrays.toString(array3));
    Sorts.selectionSort(sortedArray);
    System.out.println(Arrays.toString(sortedArray));
    int[] almostSorted2 = {1,2,3,4,6,5};
    Sorts.selectionSort(almostSorted2);
    System.out.println(Arrays.toString(almostSorted2));
    //Test insertionSort
    System.out.println("Testing insertionSort");
    int[] array4 = {10,11,13,8,4,16};
    int[] almostSorted3 = {1,2,3,4,6,5};
    Sorts.insertionSort(array4);
    Sorts.insertionSort(sortedArray);
    Sorts.insertionSort(almostSorted3);
    System.out.println(Arrays.toString(array4));
    System.out.println(Arrays.toString(sortedArray));
    System.out.println(Arrays.toString(almostSorted3));
    //More tests for insertionSort
    System.out.println("More tests for insertionSort");
    int[] wackyArray = {1,3,4,9,5,11,10,2,8,7,6};
    Sorts.insertionSort(wackyArray);
    System.out.println(Arrays.toString(wackyArray));
  }

}
