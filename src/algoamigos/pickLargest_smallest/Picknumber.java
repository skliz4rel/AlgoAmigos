/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.pickLargest_smallest;

/**
 *
 * @author skliz
 */
public class Picknumber {
    
     static int[] numbers = {6, 5,8,1,9,3,100,1000, 10,15,12,-3,101 ,16,2,7,-2,-1,102 };
     
     public static void displayLargest_smallest(){
         
         int largest = numbers[0]; //get the first number
         int smallest = numbers[0];
         for(int k=0; k<numbers.length; k++){
             
             if(numbers[k] > largest){
                 largest = numbers[k];
             }
             
             if(numbers[k] < smallest){
                 smallest = numbers[k];
             }
         }
         
         System.out.println("The largest number is  "+largest+"  and the smallest number is  "+smallest);
     }
}