/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.question1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author skliz
 */
public class Solution1 {
    
    
    private static Map returnGraph(){
	Map<String, String[]> graph = new HashMap<>();
	
	graph.putIfAbsent("f", new String[] {"g","i"});
	graph.putIfAbsent("g", new String[] {"h"});
	graph.putIfAbsent("h", new String[] {});
	graph.putIfAbsent("i", new String[] {"g","k"});
	graph.putIfAbsent("j", new String[] {"i"});
	graph.putIfAbsent("k", new String[] {});
        
        return graph;
    }
    
   /******************************Solution 1 *********************************************/
    
    public static void depthfirstanswer(){
        
        Map graph = returnGraph();
        
        boolean check = hasPath(graph, "f","k");
        
        System.out.println(check);
    }
    
    //This would not go into a cicular look becos the question is an acyclic graph
    public static boolean hasPath(Map graph,String src,String dst){

	if(src == dst) return true;
        
        
	String[] paths =  (String[])graph.get(src);
        
        if(paths != null){
            for(String neighbor : paths){
                    if(hasPath(graph, neighbor, dst) == true) return true;
            }
        }
	
	return false;
    }
    
    
    /*********************Solution 2 *********************************************/
        
    public static void depthfirstanswer1(){
        
        boolean result = depthfirstnorecurs();
        
        System.out.println(result);
    }
    
    
    public static boolean depthfirstnorecurs(){
        
        Map graph = returnGraph(); String src ="f"; String dest = "k";
        
        if(src.equalsIgnoreCase(dest)) return true;
        
        Stack<String> stack = new Stack<>();
        stack.push(src);
       
        while(stack.size() >0){
            src = stack.pop();
            
             if(src.equalsIgnoreCase(dest)) return true;
            
            String[] paths = (String[])graph.get(src);
            
            if(paths != null)
            for(String neighor : paths){
               stack.push(neighor);
            }
        }
        
        return false;
    }
    
    
    /*******************************BreadFirst solution **************************************/
    
    public static void breadthfirstsolution(){
        
        boolean check = breadthfirst();
        
        System.out.println(check);
    }
    
    
     public static boolean breadthfirst(){
        
        Map graph = returnGraph(); String src ="j"; String dest = "k";
        
        if(src.equalsIgnoreCase(dest)) return true;
        
        Queue<String> queue = new LinkedList<>();
        queue.add(src);
        
        while(queue.size() >0){
            
            src=queue.poll();
            
           if(src.equalsIgnoreCase(dest)) return true;
            
            String[] paths = (String[])graph.get(src);
            
            if(paths != null){
                for(String neighbor : paths){
                     queue.add(neighbor);
                }
            }
        }
        
        return false;
     }
    
    
}