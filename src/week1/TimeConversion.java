package week1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class TimeResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String time = s.substring(8);

        String hours = s.substring(0, 2);
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);

        if (time.equals("AM") && hours.equals("12")) {
            hours = "00";
        } else if (time.equals("PM") && hours.equals("12")) {
            hours = "12";
        } else if (time.equals("PM")) {
            hours = String.valueOf(Integer.parseInt(hours) + 12);
        }
        return hours + ":" + minutes + ":" + seconds;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeResult.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
