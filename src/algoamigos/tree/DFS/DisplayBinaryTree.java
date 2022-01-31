/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.tree.DFS;

import algoamigos.tree.DFS.BinaryTree.Node;

/**
 *
 * @author skliz
 */
public class DisplayBinaryTree {
    
     public static void displayTree(){

	BinaryTree tree = new BinaryTree();
        
        BinaryTree.Node root = tree.new Node(1);
        
	tree.root = root;
	tree.root.left= tree.new Node(2);
	tree.root.right = tree.new Node(3);
	tree.root.left.left = tree.new Node(4);
	tree.root.left.right= tree.new Node(5);


	System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

	System.out.println("Inorder traversal of binary tree is ");
        tree.printInorder();

	System.out.println("Postorder traversal of binary tree is ");
        tree.printPostorder();
    }
    
}
