/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.strings;

/**
 *
 * @author skliz
 */
public class MyString {
    
    private static String sentence = "I love women so much. They make me feel happy";
    
    public static String myStringbuffer(){
        
        
        StringBuffer buffer = new StringBuffer(sentence);
        buffer.insert(0, "Yes");
        
        buffer.append("added values");
        buffer.append("my first");
        int size = buffer.capacity(); //This is going to return the size
        
        buffer.setCharAt(0,'z');
        
        return buffer.toString();
    }
    
    public static String myStringBuilder(){
        
        StringBuilder builder = new StringBuilder(sentence);
        
        
        builder.append("added values");
        builder.append("my first");
        int size = builder.capacity(); //This is going to return the size
        
        builder.setCharAt(0,'z');
        
        return builder.toString();
    }
    
}
