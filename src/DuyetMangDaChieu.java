/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class DuyetMangDaChieu {
    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++)
                nums[i][j] = (i+1)*(j+1);
        }
        
        //Duyet mang da chieu
        for(int x[]:nums){
            for(int y:x)
                System.out.print(" "+y);
            System.out.println();
        }
    }
}
