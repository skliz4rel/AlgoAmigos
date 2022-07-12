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
public class My2darray {
    
    public static void sample(){
        
        
        int[][] arr = new int[2][2];
        
        for(int i=0; i< 2; i++){
            
            for(int j =0; j< 2; j++)
                arr[i][j] = 0;
        }
        
        System.out.println("Content of the 2d array");
        System.out.print(Arrays.deepToString(arr));
        
        //initializing the two dimensional array
        arr[0][0] = 1;
        arr[1][0] = 1;
       // arr[2][0] = 0;
        
        System.out.print(Arrays.deepToString(arr));
        
        //A short form of creating a 2 dimensional array
        char[][] boardTwo = new char[][]{

	new char[]{'0','-','-'},
	new char[]{'0','-','-'},
	new char[]{'0','-','-'},
        };
        
        
    }
}