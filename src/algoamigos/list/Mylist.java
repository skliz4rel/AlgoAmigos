/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skliz
 */
public class Mylist {
    
    public static void sample(){
        
        //Creating a generic list in java
        List any = new ArrayList();
        any.add("blue");
        any.add("purple");
        any.add(1);
        any.add(new Object());
        
        //Creating a specified list of a particular datatype
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("red");
                
        for(String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for(int i=0; i< colors.size(); i++){
            System.out.println(colors.get(i));
        }
        
        List<String> imutableList = List.of(new String[] {"blue","yellow"}); //
        List<String> imutableList1 = List.of("blue", "yellow"); //Another way of creating it.
        
        
        imutableList.indexOf("blue");
        
        //methods of the List collections
        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors.containsAll(imutableList));
        System.out.println(colors);
        
    }
    
}
