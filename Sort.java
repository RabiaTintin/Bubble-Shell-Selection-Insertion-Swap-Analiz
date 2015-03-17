package sortingalgorithm;

import java.util.Random;

public class Sort {
 
  /** Display the contents of the list. */
  public static void print(int[] list) {
    for(int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
    System.out.println();
  }
  
  /**
   * Bubble sort:
   * 
   * - traverse the list comparing pairs of elements
   * - move the larger element into the higher position
   * - repeat list.length times
   */ 
  public static void bubbleSort(int[] list) {
    int comps = 0;
    int swaps = 0;
    
    for(int j = 0; j < list.length - 1; j++) {
      for(int i = 0; i < list.length - 1; i++) {
        
        // count the number of comparisons
        comps++;
        
        // compare neighboring elements
        if(list[i] > list[i+1]) {
          
          // swap i with i+1
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          
          // count number of swaps
          swaps++;
        }
      }
    }
    print(list);
    System.out.println("Comparisons: " + comps 
                         + " Swaps: " + swaps);
  }
  
 
  public static void bubbleSort2(int[] list) {
    int comps = 0;
    int swaps = 0;
    boolean didSwap = true;
    
   
    for(int j = 0; j < list.length - 1 && didSwap; j++) {
      didSwap = false;
      
     
      for(int i = 0; i < list.length - 1 - j; i++) {
          
        // count the number of comparisons
        comps++;
        
        // compare neighboring elements
        if(list[i] > list[i+1]) {
          
          didSwap = true;
          
          // swap i with i+1
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          
          // count number of swaps
          swaps++;
        }
      }
    }
    print(list);
    System.out.println("Comparisons: " + comps 
                         + " Swaps: " + swaps);
  }
  
 
  
  public static void insertionSort(int[] list) {
    int comps = 0, swaps = 0;
    
    for(int i = 1; i < list.length; i++) {
    
      int j = i;      
            
      // compare i with sorted elements and insert it
      // sorted elements: [0..i-1]
      while (j > 0 && list[j] < list[j - 1]) {
        
        int temp = list[j];
        list[j] = list[j - 1];
        list[j - 1] = temp;
        
        swaps++;
        comps++;  // loop condition true
         
        j--;
      }
      comps++; // checking loop condition when false
    }
    print(list);
    
    System.out.println("Comparisons: " + comps 
                         + " Swaps: " + swaps);
  }
  
  public static void selectionSort(int[] list) {
    int comps = 0, swaps = 0;
    
   
    for(int i = 0; i < list.length - 1; i++) {
      int smallestIndex = i;
      
      
      for(int j = i + 1; j < list.length; j++) {
      
        if(list[j] < list[smallestIndex]) {
          smallestIndex = j;
        } 
        comps++;
      }
      
     
      int temp = list[i];
      list[i] = list[smallestIndex];
      list[smallestIndex] = temp;
      
      swaps++;
    }
    
    print(list);
     System.out.println("Comparisons: " + comps 
                         + " Swaps: " + swaps);

    
  }
  public int[] generateRandomNumbers(int n){
		
	    int[] result = new int[n];
	    Random random = new Random();
		
	    for (int i = 0; i < result.length; i++) {
		    result[i] = random.nextInt(n * 10);
	    }
	
	    return result;
	}
}
