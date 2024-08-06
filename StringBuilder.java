package Strings;

import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
        System.out.println("enter the string : ");
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++)
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                str=str.toUpperCase();
            }
        }

    }

