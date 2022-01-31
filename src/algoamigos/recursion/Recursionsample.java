/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.recursion;

/**
 *
 * @author skliz
 */
public class Recursionsample {
    
    
    public static void showFibunacci(){
        
        int n= 20;
        
        System.out.println(fibonnaci(n));
    }
    
    public static int fibonnaci(int n){
        
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
           return fibonnaci(n-1)+fibonnaci(n-2);
        }
    }
    
}
