package Strings;

import java.util.Scanner;

public class StringImmutability {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the sting : ");
        String str=sc.nextLine();
        String s="";
        for(int i=0; i<str.length(); i++){
            if(i%2==0){
                s+='a';
            }else {
                s+=str.charAt(i);
            }
        }
        System.out.println(s);
    }


}
