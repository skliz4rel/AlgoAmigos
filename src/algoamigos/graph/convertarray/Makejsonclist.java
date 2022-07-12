/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.convertarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author skliz
 */

public class Makejsonclist {
    
    private static Map<String, List<String>> newjsonlist = new HashMap();
    
    public static void convert(){
        
        String[][] graph = inputs();
        
        
        for(int r = 0; r< graph.length; r++){
            
            String[] row = graph[r];
            
            String node1 = row[0]; String node2 = row[1];
            
            boolean check = newjsonlist.containsKey(node1);
            
            if(check == false){
                newjsonlist.putIfAbsent(node1, new ArrayList<String>());
            }
            
            check = newjsonlist.containsKey(node2);
            
            if(check == false){
                newjsonlist.putIfAbsent(node2, new ArrayList<String>());
            }
            
           //fill item in the list
           List<String> list = newjsonlist.get(node1);
           list.add(node2);
           newjsonlist.replace(node1, list);
            
           
            //Do the same for the second item
            list = newjsonlist.get(node2);
            list.add(node1);
            newjsonlist.replace(node2, list);
            
        }
    }
    
    
    public static void display(){
        
        convert();
        
        System.out.println(newjsonlist);
    }
        
    public static String[][] inputs(){
        
        return new String[][] {
            {"i", "j"},
            {"k", "i"},
            {"m", "k"},
            {"k", "l"},
            {"o", "n"}
        };
    }
    
    
}
