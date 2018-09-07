/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class UseMember_Length {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] list1 = new int[20];
        int[] nums = {1,2,3};
        int[][] table = {
            {3,6,7,8},
            {34,78},
            {1}
        };
        
        System.out.println("list.length: "+list.length);
        System.out.println("nums.length: "+nums.length);
        System.out.println("number of arrays in table: "+table.length);
        System.out.println("number of member in table[0]: "+table[0].length);
        System.out.println("number of member in table[1]: "+table[1].length);
        System.out.println("number of member in table[2]: "+table[2].length);
        
        // copy members from an array to another
        for(int i=0;i<list.length;i++)
            list[i] = i;
        
        for(int i=0;i<list.length;i++)//use array which has smaller length to control for
            list1[i] = list[i];
        System.out.println("list1: ");
        for(int i=0;i<list1.length;i++)
            System.out.print(" "+list1[i]);
    }
        
}
