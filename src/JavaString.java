/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class JavaString {
    public static void main(String[] args) {
        String str1 = new String("akeep going");
        String str2 = "bgo steadily and continueously go";
        String str3 = new String(str2);
        
        System.out.println("str1.length(): "+str1.length());
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i)+" ");
       
        System.out.println();
        System.out.println("str2.indexOf(go): "+ str2.indexOf("go"));
        System.out.println("str2.lastIndexOf(go): "+ str2.lastIndexOf("go"));
        
        int compare = str2.compareTo(str1);// compare char to char and return the gap between them
        System.out.println("compare strings: "+compare);
        
        String[] subStrings = str3.split(" ");
        for(String s:subStrings)
            System.out.print(s+"|");
        System.out.println();
        String[] subs = str2.split("o",3);//if limit is negative or 0, split as many times as possible
        for(String s:subs)//if limit is positive, split (limit-1)
            System.out.print(s+" | ");
        
        //String's content is unmutable, StringBuffer's one is mutable
        System.out.println();
        StringBuffer sb = new StringBuffer("abcdef");
        sb.setCharAt(1,'B');
        sb.append(" ghijklmn");
        System.out.println(sb);
    }
}
