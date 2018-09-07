/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class CommandLine_Argument {
    public static void main(String[] args) {
        //args[] = {"Mary", "John"};
        System.out.println(args.length);
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);
        
        String[][] contact = {
            {"Mary","1234567"},
            {"John","098765"},
            {"Steve","45647"}
        };
        int i;
        for(i=0;i<contact.length;i++){
            if(args[0].equals(contact[i][0])){
                System.out.println(contact[i][1]);
                break;
            }
        }
        
        if(i==contact.length)
            System.out.println("not found");
    }
}
