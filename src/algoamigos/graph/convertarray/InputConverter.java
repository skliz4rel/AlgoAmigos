/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.convertarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 *
 * @author skliz
 */
public class InputConverter {
    
    public static void convert(){
        
        Map map = new HashMap<String, String>();
        
        String[][] array = inputs();
        
        for(int r = 0; r <array.length; r++){
            for(int c=0; c<array[r].length; c++){
                
              boolean check = map.containsKey(array[r][c]);
              
              if(check == false){
                  
                  //Extract all the values for that key you indentified.
                  String key = array[r][c];
                  List<String> list = getPaths(array,  r,  c);
                  
                  String[] paths = list.toArray(new String[0]);          
                  
                  map.put(key, paths);
              }
            }
        }
        
        map.forEach(display);
    }
    
    private static BiConsumer<String, String[]> display =(key, values)-> {

        System.out.println("key "+key+" : "+Arrays.deepToString(values));
    };
    
    
    private static List<String> getPaths(String[][] array, int r, int c){
        
        List<String> path = new ArrayList<>();
        
        String apath = returnPath(array, r,c-1);
        
        if(apath.length() > 0){
            path.add(apath);
        }
        
        apath = returnPath(array, r,c+1);
        
        if(apath.length() > 0){
            path.add(apath);
        }
        
        apath = returnPath(array, r-1,c);
        
        if(apath.length() > 0){
            path.add(apath);
        }
        
        apath = returnPath(array, r+1,c);
        
        if(apath.length() > 0){
            path.add(apath);
        }
                
        return path;
    }
    
    private static String returnPath(String[][] array, int r, int c){
        
        boolean rowBoundary = (r >= array.length || r<0) ? true : false;
        boolean columnBoundary = (c>= array[0].length || c<0) ? true : false;
        
        //check the boundrys of the walls
        if(rowBoundary || columnBoundary){
            return "";
        }
        else
            return array[r][c];
    }
    
    
    public static String[][] inputs(){
        
        return new String[][] {
            {"1", "2"},
            {"2", "3"},
            {"3", "4"},
            {"1", "5"}
        };
    }
    
}
