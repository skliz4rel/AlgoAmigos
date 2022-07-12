/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.bublesort;

import java.util.Arrays;

/**
 *
 * @author skliz
 */
public class Bubblesort {
    
    static int[] numbers = {6, 5,8,1,9,3,100,1000, 10,15,12,-3,101 ,16,2,7,-2,-1,102 };
    
    public static void sort(){  
        
        boolean notSorted = true;

      while(notSorted){ 
          notSorted = false;
            
          for(int k=0; k<numbers.length-1; k++){
            if( numbers[k] > numbers[k+1]){
                numbers = swap(k, (k+1), numbers);
                notSorted = true;
            }            
          }     
      }    
        
        //Now we are going to print the sorted values
       System.out.println(Arrays.toString(numbers));
    }
    
    
    static int[] swap(int currIndex, int nextIndex, int[] numbers){
      int currentNumber = numbers[currIndex];
      int nextNumber = numbers[nextIndex];
      
      numbers[currIndex] = nextNumber;
      numbers[nextIndex] = currentNumber;
      
      return numbers;
    }
}
