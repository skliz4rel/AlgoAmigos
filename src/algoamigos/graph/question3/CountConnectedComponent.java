/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.question3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author skliz
 */

public class CountConnectedComponent {
    
   static List<String> visited = new ArrayList();
    
   static int count = 0; static int largest = 0;
   
   
   public static void solve(){
       
       Map<String, String[]> graph = returnGraph();

       
        for(String current : graph.keySet()){            
            
          boolean check =  countValues(current,  graph);
          
          if(check){
              System.out.println(visited);
              
              count++;
          }
       }
       
       System.out.println(count);
   }
   
   
   public static boolean countValues(String current, Map map){
       
       if(isvisited(current)) return false;
       
       visited.add(current);
       
       for(String s : (String[])map.get(current)){
         
           countValues(s,  map);
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
