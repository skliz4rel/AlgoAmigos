/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoamigos.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author skliz
 */
public class Myset {
    
    
   public static void sample(){
       
       //To enable it to read 3 for the duplicate object. you need to override the toString and equals method. cos it sees it has different objects.
       
       Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        System.out.println("size of the balls "+balls.size());

        balls.forEach(System.out::println);
   }
   
   static class Ball{
    static   String ball;
       public Ball(String ball){
           this.ball = ball;
       }
       
         @Override
    public int hashCode() {
        return Objects.hash(ball);
    }

    @Override
    public  boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Ball)) {
            return false;
        } else {
            Ball other = (Ball) obj;
            if(other.ball.equalsIgnoreCase(ball)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Ball [name=" + this.ball +"]";
    }
   }
}
