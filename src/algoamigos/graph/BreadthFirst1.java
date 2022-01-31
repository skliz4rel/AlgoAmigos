/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author skliz
 */
public class BreadthFirst1 {
    
    public static void Solution(){
        
        Map map = returnGraph();
        
        Queue<String> queue = new LinkedList();
        
        String current = "a";
        queue.add(current);
        
        while(queue.iterator().hasNext()){
            
            String key = queue.poll();
            System.out.print(key + " ");
            
            
            for(String a :(String[]) map.get(key)){
                
                queue.add(a);
            }
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
