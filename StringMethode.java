package Strings;

import java.util.Scanner;

public class StringMethode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("en");
        String str="nilesa bhila patil";
        String str1="nilesb2";
        System.out.println(str.indexOf('a'));
        System.out.println(str.contains("ni"));
        System.out.println(str.compareTo(str1));
        System.out.println(str.startsWith("ni"));
        System.out.println(str.endsWith("l"));
        System.out.println(str1.concat(str));
        // substring in java
        System.out.println(str.substring(3)); // 3 se next part frm 3
        System.out.println(str.substring(3,6));  //its like slising
    }
}
