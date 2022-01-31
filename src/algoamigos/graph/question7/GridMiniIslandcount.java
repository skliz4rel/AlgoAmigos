/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.graph.question7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author skliz
 */

public class GridMiniIslandcount {
    
    
    private static List<Node> visited = new ArrayList<>();
    
    public static void solve(){
        
        int count = 0;
        TreeSet<Integer> islandCount = new TreeSet<>();
        
        String[][] graph = returnGraph();
        
        //Let iterate through
        for(int r = 0; r<graph.length; r++){
            for(int c = 0; c<graph[r].length; c++){
                
                count = returnCount(graph, r,c);
                
                if(count > 0)
                islandCount.add(count);
            }
        }
        
        //System.out.println(islandCount);
        System.out.println(islandCount.first());
    }
    
    
    public static int returnCount(String[][] graph, int r, int c){
        
        //do a boundary check
        boolean rowBoundary = (r >=0 && r < graph.length) ? true : false;
        boolean columnBoundary = (c >= 0 && c< graph[0].length) ? true : false;
        
        if( !columnBoundary || !rowBoundary){
            return 0;
        }
        
        if(graph[r][c].equalsIgnoreCase("W")){
            return 0;
        }
        
        Node node= new Node(graph[r][c], r,c);
        
        if(isvisited(node)) return 0;
        
        visited.add(node);
        
        int countNodes = 0;
        
        if(graph[r][c].equalsIgnoreCase("L")){
            countNodes=1;
        }
       
        
        int r1 = returnCount(graph, r-1, c);
        int r2 = returnCount(graph, r+1, c);
        
        int c1 = returnCount(graph, r, c-1);
        int c2 = returnCount(graph, r, c+1);
        
        //Let do a count
        if(r1 >0) countNodes += r1;
        if(r2 >0) countNodes += r2;
        
        if(c1 > 0) countNodes += c1;
        if(c2 >0) countNodes += c2;
        
        //System.out.println(r1+" "+r2+" "+c1+" "+c2);
        
        return countNodes;
    }
    
    
    private static boolean isvisited(Node node){
        return visited.stream().anyMatch(item->item.getN().equalsIgnoreCase(node.getN()) && item.getR() == node.getR() && item.getC() == node.getC() );
    }
    
    
    private static class Node{
        
        private String n;
        
        private int r;
        
        private int c;
        
        public Node(String n, int r, int c){
            this.n = n;
            this.r = r;
            this.c= c;
        }

        public String getN() {
            return n;
        }

        public int getR() {
            return r;
        }

        public int getC() {
            return c;
        }

        @Override
        public String toString() {
            return "Node{" + "n=" + n + ", r=" + r + ", c=" + c + '}';
        }       
        
    }
    
        public static String[][] returnGraph(){
        
        String[][] graph = {
            {"W","L","W","W","W"},
            {"W","L","W","W","W"},
            {"W","W","W","L","W"},
            {"W","W","L","L","W"},
            {"L","W","W","L","L"},
            {"L","L","W","W","W"}
        };        
        
        return graph;
    }
    
}
