/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {200,44,56,67,23,900,-345,-23};
        int temp;
        int left = 0, right = nums.length-1;
        int search = 67, mid;
        boolean found = false;
        
        //step1: Bubble sort
        for(int a=1;a<nums.length;a++){
            for(int b=nums.length-1;b>=a;b--){
                if(nums[b-1]>nums[b]){
                    temp = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = temp;
                }
            }    
        }
        for(int x:nums){
            System.out.print(" "+x);
        }
        System.out.println();
        
        
        //step2: binary search
        do{
          mid = (left+right)/2;
          if(search==nums[mid]){
              found = true;
              break;
          }else{
              if(search<nums[mid])
                  right = mid-1;
              else
                  left = mid+1;
          }
        }while(left<=right);
        
        if(found)
            System.out.println("Found "+search);
        else
            System.out.println("nothing found");
    }
}
