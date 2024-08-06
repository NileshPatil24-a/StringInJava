package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter hte String : ");
        String sb="zxcvda";
        char ch[]=sb.toCharArray();
        Arrays.sort(ch);
        for(char che:ch){
            System.out.print(che);
        }


    }
}
