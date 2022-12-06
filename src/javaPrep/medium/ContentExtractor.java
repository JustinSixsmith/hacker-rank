package javaPrep.medium;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class ContentExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String tag = "<(.+)>([\\w]+[^<]*)</(\\1)>";
            Pattern p = Pattern.compile(tag);
            Matcher m = p.matcher(line);
            int count = 0;

            while (m.find()) {
                System.out.println(m.group(2));
                count++;
            }
            if (count == 0) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
