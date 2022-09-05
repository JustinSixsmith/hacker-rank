package week2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class SherlockResult {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int i=0, j=arr.size()-1;
        int left=arr.get(i), right=arr.get(j);
        while(i<j){
            if(left<=right){
                i++;
                left+=arr.get(i);

            }
            else {
                j--;
                right+=arr.get(j);

            }

        }
        if(right==left){
            return "YES";
        }else return "NO";
    }
}

public class SherlockAndArray {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
        System.out.println(SherlockResult.balancedSums(arr));


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int T = Integer.parseInt(bufferedReader.readLine().trim());
//
//        for (int TItr = 0; TItr < T; TItr++) {
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            List<Integer> arr = new ArrayList<>();
//
//            for (int i = 0; i < n; i++) {
//                int arrItem = Integer.parseInt(arrTemp[i]);
//                arr.add(arrItem);
//            }
//
//            String result = SherlockResult.balancedSums(arr);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

