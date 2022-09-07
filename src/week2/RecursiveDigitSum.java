package week2;

import com.sun.security.jgss.InquireSecContextPermission;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class RecursiveResult {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here
        if(n.length()==1){
            return Integer.parseInt(n);
        }

        long a = 0;
        for (int i = 0; i < n.length(); i++) {
            a += n.charAt(i) - '0';
        }
        a = a * k;
        return superDigit(Long.toString(a), 1);
    }
}

public class RecursiveDigitSum {
    public static void main(String[] args) throws IOException {
        System.out.println(RecursiveResult.superDigit("17", 13));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        String n = firstMultipleInput[0];
//
//        int k = Integer.parseInt(firstMultipleInput[1]);
//
//        int result = RecursiveResult.superDigit(n, k);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

