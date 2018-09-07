
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class StackDemo {
    public static void main(String[] args) {
         Stack s = new Stack();
         s.push("hi");
         s.push(13);
         s.push('w');
         s.push(13.5);
         while(!s.isEmpty()){
             System.out.println(s.pop());
         }
         
       
    }
}
