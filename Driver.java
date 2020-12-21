import java.util.Arrays;
public class Driver{

  public static void main(String[]args){
    //args 0 must be size of the Array
    //args 1 must be "bubble," "selection," or "test" (unless you add more)
    int[] randData = new int[Integer.parseInt(args[0])];

    for(int i = 0 ; i < randData.length; i++){
      randData[i] =(int)(Math.random()*10000);
    }

    if(args[1].equals("bubble")){
      Sorts.bubbleSort(randData);
    }

    if(args[1].equals("selection")){
      Sorts.selectionSort(randData);
    }

    if(args[1].equals("insertion")){
      Sorts.insertionSort(randData);
    }

    if(args[1].equals("test")){
      //test bubble
      int[] randDataBubble = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.bubbleSort(randDataBubble);

      if( Arrays.equals(randData,randDataBubble)){
        System.out.println("Bubble Correct!");
      }else{
       System.out.println("Bubble Not Correct!!!!!!!!!11oneeleven");
      }

      //test selection
      int[] randDataSelection = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.selectionSort(randDataSelection);

      if( Arrays.equals(randData,randDataSelection)){
        System.out.println("Selection Correct!");
      }else{
       System.out.println("Selection Not Correct!!!!!!!!!11oneeleven");
      }

      //test insertion
      int[] randDataInsertion = Arrays.copyOf(randData,randData.length);
      Arrays.sort(randData);
      Sorts.insertionSort(randDataInsertion);

      if( Arrays.equals(randData,randDataInsertion)){
        System.out.println("Insertion Correct!");
      }else{
       System.out.println("Insertion Not Correct!!!!!!!!!11oneeleven");
      }
    }
  }
}
