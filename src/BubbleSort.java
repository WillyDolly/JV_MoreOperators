/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {-99,-89,100,45,67,0,345,-100,23,-1998,1453646,54,86,-994,124,648,951,357,654,842635,120};
        int a,b,t;
        System.out.println("Original array: ");
        for(int i=0;i<nums.length;i++)
            System.out.print(" "+nums[i]);
        System.out.println("");
        
        // sort Array
        for(a=1;a<nums.length;a++){
            for(b=nums.length-1;b>=a;b--){
                if(nums[b-1]<nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        
        System.out.println("sorted Array: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }
}
