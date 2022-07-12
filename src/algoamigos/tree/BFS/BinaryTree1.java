/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.tree.BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author skliz
 */
public class BinaryTree1 {
    
    Node root;
    
     /* Given a binary tree. Print
     its nodes in level order
     using array for implementing queue  */
    
    void printLevelOrder(){
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
              /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/
            util/linkedlist_poll.htm */
              
              Node tempNode = queue.poll();
              
              System.out.print(tempNode.data+" ");
              
               /*Enqueue left child */
              if(tempNode.left != null){
                  queue.add(tempNode.left);
              }
              
               /*Enqueue right child */
               if(tempNode.right != null){
                   queue.add(tempNode.right);
               }
        
        }
    }
  
    
    
    class Node{
        
        int data;
        Node left, right;
        
        public Node(int key){
            this.data = key;
            
            left = right = null;
        }
    }
    
}