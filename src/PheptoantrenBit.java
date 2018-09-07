/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class PheptoantrenBit {
    public static void main(String[] args) {
        char ch = ' ' ;
        System.out.println("AND");
//        System.out.println("lowercase to uppercase: ");
//        for(int i=0;i<10;i++){
//            ch = (char)('a'+i);
//            System.out.print(ch);     
//            ch = (char)((int)ch & 223); 
//            System.out.print(ch +" ");
//        }

        
//           System.out.println("showbit");
//           int t;
//           int val;
//           val = 255;
//           for(t=128;t>0;t=t/2){
//               if((val&t) !=0) 
//                   System.out.print("1");
//               else 
//                   System.out.print("0");
//           }

          System.out.println("OR");
          System.out.println("uppercase to lowercase: ");
          for(int i=0;i<10;i++){
             ch = (char)('A' + i);         
              System.out.print(ch);
              ch = (char)(ch | 32);
              System.out.print(ch+" ");
          }
         
         System.out.println("XOR");
         String msg = "this is a test";
         String enmsg = "", demsg = "";
         int key = 88;
         
         for(int i=0;i<msg.length();i++){
             enmsg = enmsg + (char)(msg.charAt(i)^key);
         }
         System.out.println("encrypted string:"+enmsg+"|");
         for(int i=0;i<msg.length();i++){
             demsg = demsg + (char)(enmsg.charAt(i)^key);
         }
         System.out.println("decoded string: "+demsg);
         
         System.out.println("NOT");
         byte b = 34;
         for(int t=128;t>0;t=t/2){
             if((b & t)!=0) System.out.print("1");
             else System.out.print("0");
         }
         System.out.println();
         b = (byte) ~b;
         System.out.println(b);
         for(int t=128;t>0;t=t/2){
             if((b & t)!=0) System.out.print("1");
             else System.out.print("0");
         }
         
         System.out.println();
         System.out.println("dung phep bu 2 de bieu dien so nguyen am: ");
         byte num = 100;
         boolean on = false;
         StringBuffer reverseNum = new StringBuffer();
         int NumReverse = 0;
         System.out.println("binary display of num: ");
         for(int t=128;t>0;t=t/2){
             if((num & t)!=0) System.out.print("1");
             else System.out.print("0");
         }
         
        System.out.println();
        System.out.println("nguyen tac bu 2");         
//         System.out.println("\n binary display of -num: ");
//         for(int i=1;i<=128;i=i*2){
//             if(!on){
//               if((num & i)!=0){
//                    reverseNum.append("1");
//                   on = true;
//               }else
//                    reverseNum.append("0");
//             }else{
//                 if((num & i)!=0){
//                    reverseNum.append("0");
//               }else
//                    reverseNum.append("1");
//             }
//         }
//         System.out.println(reverseNum);
//         System.out.println(reverseNum.reverse());

        System.out.println("binary to decimal");      
//         String[] subNum = reverseNum.split("");
//         System.out.println(subNum.length);
//         for(int i=0;i<subNum.length;i++){
//             int binary = Integer.parseInt(subNum[i]);
//             NumReverse = NumReverse + binary*((int)Math.pow(2, i));
//         }
//         System.out.println("NumReverse: "+NumReverse);

         System.out.println("OPERATOR MOVING BIT");
         int so = 1;
         for(int i=0;i<8;i++){
             System.out.println("so = "+so);
             for(int t=128;t>0;t=t/2){
                 if((so & t)!=0) System.out.print("1");
                 else System.out.print("0");
             }
             System.out.println();
             so = so << 1;
         }
         
         so = 10;
        for(int i=0;i<8;i++){
             System.out.println("so = "+so);
             for(int t=128;t>0;t=t/2){
                 if((so & t)!=0) System.out.print("1");
                 else System.out.print("0");
             }
             System.out.println();
             so = so >>> 1;
         }
    }
}
