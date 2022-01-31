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
public class DepthFirst1 {
    
    public static void Solution(){
        System.out.println("Refresher of graphs  ");
        
        Map graph = returnGraph();
        
        Stack<String> stack = new Stack<String>();
        
        String firstKey = "a";
        stack.add(firstKey);
        
        while(stack.iterator().hasNext()){
            
            String key   = stack.pop();
            System.out.print(key+" ");
            
            String[] edges = (String[])graph.get(key);
            
            for(String e : edges){
                
                stack.add(e);
            }
        }
    }
    
    
    //This is the approach two
    public static void solution_recurs(){
        
        System.out.println("This is a recursive approach to the DepthFirst ");
        
        Map graph = returnGraph();
        
        Stack<String> stack = new Stack<String>();
        
        String current = "a";
        stack.add(current);
        
        recurse(current,stack,graph);
    }
    
    
    public static void recurse(String current,Stack stack,Map graph){
        
        System.out.println(current);
        
        for(String e :(String[]) graph.get(current)){
                
                stack.add(e);
       
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
