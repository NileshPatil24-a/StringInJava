package Strings;

import java.util.Arrays;

public class AnagramString {
    public boolean isAnagram(String m, String t) {
        if(m.length()!=t.length()) return false;
        char[] a = t.toCharArray();
        Arrays.sort(a);
        char[] b = m.toCharArray();
        Arrays.sort(b);
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a="abc";
        String b="bca";

    }
}
