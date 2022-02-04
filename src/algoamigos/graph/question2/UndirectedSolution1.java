/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author skliz
 */
public class UndirectedSolution1 {
    
   static List<String> visited = new ArrayList<>();
    
    
    public static void solve(){
        
        String src="j"; String dest = "k";
        
        Stack<String> stack =new Stack<>();
        stack.add(src);
        
        Map<String, String[]> graph = returnGraph(); 
        //String a = graph.keySet().toArray()[0];
        
        boolean result = solver( stack, graph, src, dest );
        
        System.out.println(result);
    }
    
    
    private static boolean solver(Stack<String> stack, Map graph, String src, String dest ){
        
        if(src.equalsIgnoreCase(dest)) return true;
        
        while(stack.iterator().hasNext()){
            
            String current = stack.pop();
            
            if(isvisited(current)  == true){
                continue;
            }
            else
            {
                visited.add(current);                
            }
            
            if(current.equalsIgnoreCase(dest)){
                return true;
            }
            
            for(String key : (String[])graph.get(current)){
                stack.add(key);
            }
        }
        
        return false;
    }
    
    //This method woudl use streams api to extract egdes that have been visited
    private static boolean isvisited(String edge){
        
        return visited.stream().anyMatch(item->item.equalsIgnoreCase(edge));
    }
    
    
      private static Map returnGraph(){
	Map<String, String[]> graph = new HashMap<>();
	
	graph.putIfAbsent("i", new String[] {"j","k"});
	graph.putIfAbsent("j", new String[] {"i"});
	graph.putIfAbsent("k", new String[] {"i","m","l"});
	graph.putIfAbsent("m", new String[] {"k"});
	graph.putIfAbsent("l", new String[] {"k"});
	graph.putIfAbsent("o", new String[] {"n"});
        graph.putIfAbsent("n", new String[] {"o"});
        
        return graph;
    }
    
}