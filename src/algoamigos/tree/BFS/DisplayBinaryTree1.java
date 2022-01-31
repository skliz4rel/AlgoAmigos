/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.tree.BFS;

/**
 *
 * @author skliz
 */
public class DisplayBinaryTree1 {
    
    public static void displayTree(){
        
         /* creating a binary tree and entering
         the nodes */
         BinaryTree1 tree = new BinaryTree1();
         
         tree.root = tree.new Node(1);
         tree.root.left= tree.new Node(2);
         tree.root.right = tree.new Node(3);
         tree.root.left.left = tree.new Node(4);
         tree.root.left.right = tree.new Node(5);
         
         System.out.println("Level order traversal of binary tree is - ");
         tree.printLevelOrder();    
    }
    
}
