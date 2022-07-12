/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoamigos.tree.DFS;

/**
 *
 * @author skliz
 * https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 * https://www.tutorialspoint.com/data_structures_algorithms/tree_traversal.htm
 */


public class BinaryTree {
    
    //Root node of the binary treet
    public Node root;
    
    BinaryTree(){
        root = null;
    }
    
    
    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    //left, right, node
    void printPostorder(Node node){
        
        if(node == null) return;
        
        //first occurs on the left
        printPostorder(node.left);
        
        //first occurs on the right
        printPostorder(node.right);
        
        // now deal with the node
        System.out.print(node.key + " ");        
    }
    
     /* Given a binary tree, print its nodes in inorder*/
    //left, node, right
    void printInorder(Node node){
        
        if(node == null) return;
        
        printInorder(node.left);
        
        // now deal with the node
        System.out.print(node.key + " ");
        
        printInorder(node.right);             
    }
    
    
    /* Given a binary tree, print its nodes in preorder*/
    //node, left, right
    void printPreorder(Node node){
    
        if(node == null) return;
        
        //visit the node first
        System.out.print(node.key+" ");
        
        printPreorder(node.left);
        
        printPreorder(node.right);
    }
    
     // Wrappers over above recursive functions
    void printPostorder(){
        
        printPostorder(root);
    }
    
    void printInorder(){
        
        printInorder(root);
    }
    
     void printPreorder(){
         
        printPreorder(root);
     }
     
    public class Node{
        int key;
        Node left, right;
        
        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }
    
}