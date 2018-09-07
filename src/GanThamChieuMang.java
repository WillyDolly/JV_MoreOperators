/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GanThamChieuMang {
    public static void main(String[] args) {
        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        
        for(int i=0;i<5;i++){
            nums1[i] = i;
        }
        for(int i=0;i<5;i++){
            nums2[i]= -i;
        }
        
        System.out.print("nums1: ");
        for(int i=0;i<5;i++)
            System.out.print(" "+nums1[i]);
        System.out.println("");
        System.out.print("nums2: ");
        for(int i=0;i<5;i++)
            System.out.print(" "+nums2[i]);
        
        System.out.println("");
        nums2 = nums1;
        System.out.println("nums2 after assignment: ");
        for(int i=0;i<5;i++)
            System.out.print(" "+nums2[i]);
        
        nums2[4] = 99;
        System.out.println("");
        System.out.println("nums1 modified by nums2: ");   
        for(int i=0;i<5;i++)
            System.out.print(" "+nums1[i]);
    }
}
