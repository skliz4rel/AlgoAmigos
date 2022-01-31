/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.question1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author skliz
 */
public class Solution2 {
    
    
    public static void solve(){
        
        String src = "f";  String dest = "j";
        
        Map map = returnGraph();
        
        Stack<String> stack = new Stack <>();
        stack.add(src);
        
        System.out.println(hasPath( stack, src ,  dest, map));
    }
    
    private static boolean hasPath(Stack<String> stack, String src , String dest, Map map){
        
            if(src.equalsIgnoreCase(dest)){
                return true;
            }
        
        while(stack.iterator().hasNext()){
            String current = stack.pop();
            
            if(current.equalsIgnoreCase(dest)){
                return true;
            }
            
            for(String key : (String[])map.get(current)){
                
                stack.add(key);
            }
        }
        
        return false;
    }
    
        
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
    
    
}