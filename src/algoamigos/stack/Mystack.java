/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.stack;

import java.util.Stack;

/**
 *
 * @author skliz
 */
public class Mystack {
    
    public static void sample(){
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
         
         System.out.println("total stack "+stack.size());

        System.out.println("Peeked the last item inserted "+stack.peek());  //This is not going to remove the element from the stack.
        System.out.println(stack.size());
        System.out.println("Popped the last item inserted  "+stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}