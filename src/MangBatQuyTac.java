/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class MangBatQuyTac {
    public static void main(String[] args) {
        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];
        
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++)
                riders[i][j] = i +j+10;
        }
        
        for(int i=5;i<7;i++){
            for(int j=0;j<2;j++)
                riders[i][j] = i+j+10;
        }
        
        System.out.println("The number of passengers in weekday: ");
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++)
                System.out.print(" "+riders[i][j]);
            System.out.println("\n");
        }
        
        System.out.println("\n");
        System.out.println("The number of passengers in weekend: ");
        for(int i=5;i<7;i++){
            for(int j=0;j<2;j++)
                System.out.print(" "+riders[i][j]);
            System.out.println("\n");
        }
    }
}
