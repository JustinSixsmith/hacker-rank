package week1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String stringsXOR(String s, String t) {
        HashSet<Character> string1 = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            string1.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (string1.contains(t.charAt(i))) {
                return "YES";
            }
                return "NO";
        }

    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

}