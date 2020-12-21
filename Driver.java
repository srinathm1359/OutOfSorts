import java.util.Arrays;
public class Driver{

  public static void main(String[]args){
    if(args.length < 2){
      System.out.println("usage: java Driver SIZE ALGO [STYLE]");
      System.out.println("supported ALGO: bubble,selection,insertion,test");
      System.out.println("supported STYLE: random,equal,sorted,reversed");
    }
    else{
      int[] randData = new int[Integer.parseInt(args[0])];

      for(int i = 0 ; i < randData.length; i++){
        randData[i] =(int)(Math.random()*10000);
      }

      if(args[1].equals("bubble")){
        Sorts.bubbleSort(randData);
      }
      else if(args[1].equals("selection")){
        Sorts.selectionSort(randData);
      }
      else if(args[1].equals("insertion")){
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
}
