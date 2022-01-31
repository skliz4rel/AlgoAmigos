/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author skliz
 */
public class MyLinkedlist {
    
    public static void sample(){
        
        LinkedList<Person> list= new LinkedList<>();
        
        list.add(new Person("Jide", 20));
        list.add(new Person("Gbemi", 22));
        list.add(new Person("Bolaji", 25));
        list.addFirst(new Person("Femi",22));
        list.addLast(new Person("Lemi", 33));
        
        ListIterator<Person> personIterator = list.listIterator();
        while(personIterator.hasNext()){
                System.out.println(personIterator.next());
        }
        
        System.out.println();
        
        while(personIterator.hasPrevious()){
                System.out.println(personIterator.previous());
        }        
    }
    
        
    
 static class Person{
    
    public Person(String name, int age)
    {}
}


}