/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.question4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author skliz
 */
public class Largestconnectedgraph {
        
   static List<String> visited = new ArrayList();
    
   static int count = 0; static int largest = 0;
    
   static Stack<String> stack = new Stack<>();
   
   public static void solve(){
       
       Map graph = returnGraph();
       
       String firstkey = (String)graph.keySet().stream().findFirst().get();
      
       stack.add(firstkey);
       
       while(stack.iterator().hasNext()){
           
           String current = stack.pop();
           
          boolean check =  countValues(current, stack, graph);
          
          if(count > largest){
              
              largest = count;
              count = 0; //reset the counter variable
          }
       }
       
       System.out.println("Largest connected  "+largest);
   }
    
   
   public static boolean countValues(String current, Stack stack, Map map){
       
       if(isvisited(current)) return false;
       
       visited.add(current);
       
       for(String s : (String[])map.get(current)){
           
           stack.add(s);
           count++;
       }
       
       return true;
   }

    
    //ch neck if the edge has been visited
    private static boolean isvisited(String s){
        boolean check = visited.stream().anyMatch(item->item.equalsIgnoreCase(s));
        
        return check;
    }
    
        
      private static Map returnGraph(){
	Map<String, String[]> graph = new HashMap<>();
	
	graph.putIfAbsent("0", new String[] {"8","1","5"});
	graph.putIfAbsent("1", new String[] {"0"});
	graph.putIfAbsent("5", new String[] {"0","8"});
	graph.putIfAbsent("8", new String[] {"0","5"});
	graph.putIfAbsent("2", new String[] {"3","4"});
	graph.putIfAbsent("3", new String[] {"2","4"}); 
        graph.putIfAbsent("4", new String[] {"3","2"});
        
        return graph;
    }
    
}
