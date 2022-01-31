/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph;

import static algoamigos.graph.DepthFirst.returnGraph;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author skliz
 */
public class BreadthFirst {
    
    //For Breadth First We use a queue because when we are reading through the path. We want a scenario were the point arround the starting node. Are read first.
    //So the new Nodes added would be read last. Remember a Queue is FIFO. First element passed in would be read while others would come at the last.
    
    public static void readGraph(){
        
        String source = "a";
        
        Map graph = returnGraph();
        Queue<String> queue = new LinkedList<>();
        
        queue.add(source);
        
        while(queue.size() >0){
            
           String current =  queue.poll();
           System.out.println(current);
           
           String[] paths = (String[])graph.get(current);
           
           for(String s : paths){
               queue.add(s);
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
