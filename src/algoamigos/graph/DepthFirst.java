/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author skliz
 */
public class DepthFirst {
    
    //For DepthFirst we use a Stack because we want the program to read a path in depth before going to other paths.
    //becos of this we use a Stack LIFO. so that we read the Last value added first. So program can flow deep in a path before going to other close path.
    
    //This is going to use depth first 
    public static void readTrugraph(){
        
        String source = "a";
        Map graph = returnGraph();
        
        
        Stack<String> stack = new Stack<>();        
        stack.push(source);
        
        
        while(stack.size() > 0){
            
            String current = stack.pop(); //polls and remove the item from the stack
         
            System.out.println(current);
            
            for(String s : ((String[])graph.get(current))){
                
                stack.push(s);
                
            }
        }
    }
    
    
   public static void readTrugraph_recursively(){
       
        Map graph = returnGraph();
         String source = "a";
       recursive(graph,  source);
   }
   
   public static void recursive(Map graph, String source){
       
       System.out.println(source);
       
       for(String s : (String[])graph.get(source)){
           recursive( graph, s);
       }
   }
    
    public static Map returnGraph(){
        
        Map<String, String[]> graph = new HashMap<>();
        
        graph.putIfAbsent("a", new String[] {"c","b"});
        graph.putIfAbsent("b", new String[] {"d"});
        graph.putIfAbsent("c", new String[] {"e"});
        graph.putIfAbsent("d", new String[] {"f"});
        graph.putIfAbsent("e", new String[] {});
        graph.putIfAbsent("f", new String[] {});
        
        return graph;
    }
    
}
