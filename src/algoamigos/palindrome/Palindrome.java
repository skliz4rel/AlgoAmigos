/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.palindrome;

/**
 *
 * @author skliz
 */
public class Palindrome {
    
    public static void solve(){
    
       String letter = "babad";
       
            
        if(letter.trim().length() == 1){
           System.out.println(letter);
        }
        
       
       String reversed = "";// reverseLet(letter);
       
       //We would read from back and remove one letter
       for(int i=0; i<letter.length(); i++){
           
           String newletter = letter.substring(i,letter.length());
           
           reversed = reverseLet(newletter);
           
           if(newletter.length() > 1 && newletter.equalsIgnoreCase(reversed)){
               System.out.println("A Panlindrum  "+newletter);
           }
       }
      
       for(int i=letter.length()-1; i>=0; i--){
           
           String newletter = letter.substring(0,i);
           
           reversed = reverseLet(newletter);
           
           if(newletter.length() > 1 && newletter.equalsIgnoreCase(reversed)){
               System.out.println("A Panlindrum  "+newletter);
           }
       }
       
       
       //The 3rd
       boolean dontStop = true; int firstletter = 0; int lastletter = letter.length();
       
      // System.out.println();
      
      String result  = "";
      
       do {
          String newletter =  letter.substring(firstletter, lastletter);
          
          reversed = reverseLet(newletter);
          
           if(newletter.length() > 1 && newletter.equalsIgnoreCase(reversed)){
               System.out.println("A Panlindrum  "+newletter);
               
               result = newletter;
               dontStop = false;
               break;
           }
           
           if(newletter.length() == 1){
               dontStop = false;
           }
           
           firstletter++;  lastletter--;
       }while(dontStop);
      
       System.out.println(result);
    }
    
    private static String reverseLet(String letter){
        String reversed = "";
        
        for(int k=letter.length()-1; k>=0; k--){
            reversed += letter.charAt(k)+"";
        }
        
        return reversed;
    }
    
}
