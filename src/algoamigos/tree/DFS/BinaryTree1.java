/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.tree.DFS;

/**
 *
 * @author skliz
 */
public class BinaryTree1 {
    
    //node, left, right
    public void preorderTransversal(Node node){
        
        if(node == null){
            return;
        }
        
        System.out.println(node.key);
        
        preorderTransversal(node.left);
        
        preorderTransversal(node.right);
    }
    
    
    //left, node, right
    public void inorderTransversal(Node node){
        
        if(node == null){
            return;
        }
        
        inorderTransversal(node.left);
        
        System.out.println(node.key);
        
        inorderTransversal(node.right);
    }
    
    //left, right , node
    public void postorderTransversal(Node node){
        
        if(node == null){
            return;
        }
        
        postorderTransversal(node.left);
        
        postorderTransversal(node.right);
        
        System.out.println(node.key);
    }
    
    class Node{
        
        public int key;
        
        public Node left;
        
        public Node right;
        
        public Node(int key){
            this.key = key;
        }
    }    
}
