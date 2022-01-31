/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos;

import algoamigos.arrays.My2darray;
import algoamigos.arrays.Myarray;
import algoamigos.bublesort.Bubblesort;
import algoamigos.graph.BreadthFirst;
import algoamigos.graph.BreadthFirst1;
import algoamigos.graph.DepthFirst;
import algoamigos.graph.DepthFirst1;
import algoamigos.graph.convertarray.InputConverter;
import algoamigos.graph.question1.Solution1;
import algoamigos.graph.question1.Solution2;
import algoamigos.graph.question2.UndirectedSolution1;
import algoamigos.graph.question3.CountConnectedComponent;
import algoamigos.graph.question4.Largestconnectedgraph;
import algoamigos.graph.question5.Shortestposibledistance;
import algoamigos.graph.question6.GridgraphsSolution;
import algoamigos.graph.question7.GridMiniIslandcount;
import algoamigos.list.Mylist;
import algoamigos.palindrome.Palindrome;
import algoamigos.pickLargest_smallest.Picknumber;
import algoamigos.recursion.Recursionsample;
import algoamigos.set.Myset;
import algoamigos.stack.Mystack;
import algoamigos.tree.BFS.DisplayBinaryTree1;
import algoamigos.tree.DFS.DisplayBinaryTree;

/**
 *
 * @author skliz
 */
public class AlgoAmigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Myarray.sample();
        
        My2darray.sample();
        
        Mylist.sample();
        
        Mystack.sample();
        
        System.out.println();
        
        Myset.sample();
        
        
        DepthFirst.readTrugraph();
        
        System.out.println();
        DepthFirst.readTrugraph_recursively();
    
        System.out.println("Reading through a Graph Bread First");
        BreadthFirst.readGraph();
        
        System.out.println("Graph solution 1");
        Solution1.depthfirstanswer();
        
        
         System.out.println("Graph solution1, Longer approach 1");
        Solution1.depthfirstanswer1();
        
        
        System.out.println("Graph solution1 Breadth first");
        Solution1.breadthfirstsolution();
        
        
               
       DepthFirst1.Solution();
       
       DepthFirst1.solution_recurs();
       
       
       System.out.println("Bread first solution for recalling sake");
       BreadthFirst1.Solution();
       
       System.out.println("Graph question 1");
       Solution2.solve();
       
       
       System.out.println("Solution to Undirected Graph");
       UndirectedSolution1.solve();
       
       
       System.out.println("Count connected component");
       CountConnectedComponent.solve();
       
       System.out.println("Largest graph size");
      Largestconnectedgraph.solve();
      
      System.out.println("Shortest possible distance");
      Shortestposibledistance.solve();
      
      System.out.println("This is transversing through a grid graph problem");
      GridgraphsSolution.solve();
      
      //GridgraphsSolution.printDebug();
      
      System.out.println("This is going to print smallest island");
      GridMiniIslandcount.solve();
      
      
      System.out.println("This is going to print the binary Tree");
      DisplayBinaryTree.displayTree();
      
      System.out.println("This is goign to show binary Tree with Breath First Search");
      DisplayBinaryTree1.displayTree();
      
      
      System.out.println("This is going to show an implementation of bubble sort");
      Bubblesort.sort();
      
      System.out.println("This is going to show largest and smallest number   ");
      Picknumber.displayLargest_smallest();
      
      
      System.out.println("This is a palindrome letter");
      Palindrome.solve();
      
      System.out.println("This is going to show Recurrsion ");
      Recursionsample.showFibunacci();
      
      System.out.println("This is an input converter that would convert two or multiple dimensional array to a Json c list or HashMap");
      InputConverter.convert();
    }
    
    
    
}
