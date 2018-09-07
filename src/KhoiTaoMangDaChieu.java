/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class KhoiTaoMangDaChieu {
    public static void main(String[] args) {
        int[][] sqrt = {
            {1,1},
            {2,4},
            {3,9},
            {4,16},
            {5,25}
        } ;
        
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++)
                System.out.print(" "+sqrt[i][j]);
            System.out.println("\n");
        }
    }
}
