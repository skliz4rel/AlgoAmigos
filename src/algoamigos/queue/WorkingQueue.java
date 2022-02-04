/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author skliz
 */
public class WorkingQueue {
    
    public static void display(){
        
        Queue<Person> supermarket = new LinkedList<>();
	
supermarket.add(new Person("Alex",21));
supermarket.add(new Person("Mariam",18));
supermarket.add(new Person("Ali",40));

System.out.println(supermarket.size());
System.out.println(supermarket.peek()); //This would peek the first FIFO
System.out.println(supermarket.poll()); //This would poll the first and remove it from the queue.
System.out.println(supermarket.size());
System.out.println(supermarket.peek());

System.out.println(supermarket.remove());//This is similar to the poll(); Just that it throws an exception.

    }
    
    
    
 static class Person{
    
    public Person(String name, int age)
    {}
}

}