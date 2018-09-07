/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class IntegerToBinary {
    public static void main(String[] args) {
        ShowBits by = new ShowBits(8);
        ShowBits sh = new ShowBits(16);
        ShowBits in = new ShowBits(32);
        ShowBits lo = new ShowBits(64);
        
        System.out.println("binary of 123");
        by.show(123);
        System.out.println("binary of 30000");
        sh.show(30000);
         System.out.println("binary of 87987");
        in.show(87987);
         System.out.println("binary of 237658768");
        lo.show(237658768);
    }
}
