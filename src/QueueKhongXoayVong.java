/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class QueueKhongXoayVong {
    public static void main(String[] args){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        try{
        for(int i=0;i<101;i++)
            bigQ.put((char)('A'+i));
        }catch(QueueFullException qfe){
            System.out.println(qfe);
        }
        try{
        for(int i=0;i<110;i++){
            ch = bigQ.get();
            if(ch!=(char)0) System.out.print(ch);
        }
        }catch(QueueEmptyException qee){
            System.out.println(qee);
        }
        System.out.println();
        
        try{
        for(int i=0;i<5;i++){
            System.out.print("Try to store "+(char)('Z'-i));
            smallQ.put((char)('Z'-i));
            System.out.println();
        }
        }catch(QueueFullException qfe){
            System.out.println(qfe);
        }
        
        try{
        for(int i=0;i<5;i++){
            ch = smallQ.get();
            if(ch!=(char)0) System.out.print(ch);
        }
        }
        catch(QueueEmptyException qee){
            System.out.println(qee);
        }
    }
}
