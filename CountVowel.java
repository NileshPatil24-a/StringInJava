package Strings;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int count=0;
        char arr[]={'a','e','i','o','u'};
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==arr[i]){
                count++;
            }
        }
    }
}
