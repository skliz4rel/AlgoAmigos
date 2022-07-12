/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoamigos.graph.question5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

/**
 *
 * @author skliz
 */
public class Shortestposibledistance {
    
    //Always use a BreadFirsthSearch to solve Shortest possible distance cos it is more efficient than DepthFirstSearch

    static List<String> visited = new ArrayList<>();
    
    static  int distance = 0;
    
    public static void solve(){
        Map graph = returnGraph();
        
        String src  ="w", dest = "z";
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(src, distance));

        
            int result =  findShortest(queue,  graph, dest) ;
    
            System.out.println(result);
    }
    
    //This finds the shortest distance
    private static int findShortest( Queue<Node> queue, Map graph, String dest){
        
     
        while(queue.size() >0){
               Node current = queue.poll();
               
               visited.add(current.getNode());
               
               if(current.getNode().equals(dest)) return current.getDistance();
              
       
               for(String edge : (String[])graph.get(current.getNode())){
                   
                   distance = current.getDistance();
                   
                   if(isvisited(edge) == false){
                        queue.add(new Node(edge, distance+1));                        
                   }                   
               }
               
               
        }
        
        return -1;
    }
    
    private static boolean isvisited(String current){
      return visited.stream().anyMatch(item->item.equalsIgnoreCase(current));
    }
    
    public static Map<String, String[]> returnGraph(){
        
        Map<String, String[]> graph = new HashMap<>();
        
        graph.putIfAbsent("w", new String[]{"x","v"});
        graph.putIfAbsent("x", new String[]{"w","y"});
        graph.putIfAbsent("y", new String[]{"x","z"});
        graph.putIfAbsent("z", new String[]{"y","v"});
        graph.putIfAbsent("v", new String[]{"z","w"});
      
        return graph;
    }
 
    
    private static class Node{
        
        public String node;
        
        private int distance;
        
        public Node(String node, int distance){
            this.node = node;
            this.distance = distance;
        }
        
        public String getNode(){
            return node;
        }
        
        public int getDistance(){
            return distance;
        }

        @Override
        public String toString() {
            return "Node{" + "node=" + node + ", distance=" + distance + '}';
        }
    }
    
}