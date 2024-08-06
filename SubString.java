package Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String str=sc.nextLine();
        String demo="";
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length()+1; j++){
                //demo=demo+str.substring(0,i);
                System.out.println(str.substring(i,j));
            }
        }
    }
}
