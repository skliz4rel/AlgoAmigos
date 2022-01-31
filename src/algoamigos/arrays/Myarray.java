/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.arrays;

import java.util.Arrays;

/**
 *
 * @author skliz
 */
public class Myarray {
    
    public static void sample(){
	
		String[] colors = new String[10];
		
		colors[0] = "purple";
		colors[1] = "blue";
		
		System.out.println(Arrays.toString(colors));
		
		System.out.println(colors[0]);
                
                //Reading Array from the front
                System.out.println();
                for(int i=0; i< colors.length; i++){
                    System.out.print(colors[i]+" ");
                }
                
                System.out.println();
                
                for(int i=colors.length-1; i>=0; i--){
                      System.out.print(colors[i]+" ");
                }
                
                System.out.println();
                
                System.out.println("This is the length of the array "+colors.length);
                
                //Another style to loop is use foreach in java
                for(String color : colors){
                    System.out.print(color+"  ");
                }
		
                System.out.println();
                
                Arrays.stream(colors).forEach(System.out::print);
                
                System.out.println();
                
		//A short form of declaring an array in java
		int[] numbers = {100,200};
		
		System.out.println(Arrays.toString(numbers));
	}
    
}