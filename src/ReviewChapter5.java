/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ReviewChapter5 {
    public static void main(String[] args) {
        //1. trung binh cong
        int[] num = {2,5,68,34};
        int sum = 0;
        for(int i: num){
            sum = sum + i ;
        }
        System.out.println("trung binh cong cua mang num: "+sum/num.length);
        
        System.out.println();
        //2. Bubble sort with String
        String[] fruit = {"lemon","melon","gustav","banana"};
        for(int a=1;a<fruit.length;a++){
            for(int b=fruit.length-1;b>=a;b--){
                if(fruit[b-1].compareTo(fruit[b])>0){
                  String temp = fruit[b-1];
                  fruit[b-1] = fruit[b];
                  fruit[b] = temp;
                }
                 for(String fru : fruit){
                    System.out.print(fru +" ");
                 }
                 System.out.println();
            }
        }
        System.out.println("result: ");
        for(String fru : fruit)
        System.out.print(fru +" ");
        
        System.out.println();
        //7.encode with 8-char string
        String msg = "think simple";
        String encode = "", decode = "";
        String key = "abcdefgh";
        int j=0;
        for(int i=0;i<msg.length();i++){
            encode = encode + (char)(msg.charAt(i)^key.charAt(j));
            j++;
            if(j==8) j=0;
        }
        System.out.println("encoded msg:"+encode);
        j=0;
         for(int i=0;i<msg.length();i++){
            decode = decode + (char)(encode.charAt(i)^key.charAt(j));
            j++;
            if(j==8) j=0;
        }
        System.out.println("decoded msg:"+decode);
        
        System.out.println();
        //13.minmax
        int[] random = {87,993,56,8,98,67};
        int min, max;
        min = max = random[0];
        for(int i : random){
            if(i < min)  min = i;
            if(i > max) max =i;
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
}
