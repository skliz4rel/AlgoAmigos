/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mymap;

import algoamigos.graph.DepthFirst1;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author skliz
 */
public class Maysample {
    
    public static void sample(){
	Map<Integer, Person> map = new HashMap<>();
	
	map.put(1, new Person("Alex"));
	map.put(2, new Person("Alexa"));
	map.put(3, new Person("Mariam"));
	map.put(4, new Person("Fenu"));
	
	System.out.println(map);
	System.out.println(map.size());
	System.out.println(map.get(1));
	System.out.println(map.containsKey(4));
	System.out.println(map.keySet());
	System.out.println(map.entrySet());
        map.remove(3);
	map.entrySet().forEach(System.out::println);
	
	map.entrySet().forEach(x->System.out.println(x.getKey() +"  "+ x.getValue()));
	
	map.forEach((key,person) -> {
		System.out.println(key +" "+person);
	});
        
        System.out.println(map.getOrDefault(map, new Person("default")));
        System.out.println(map.values());//This woudl println only the values
        System.out.println(map.keySet());
 
       char a1 = 'b';
       String line = "asdf";
       line = line.toLowerCase();  double a = 10; 
       Character A = a1;
       
       A.charValue();

}

 static class Person{
     
     private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    @Override
    public int hashCode(){
      return Objects.hash(this.name);
    }
}


}
