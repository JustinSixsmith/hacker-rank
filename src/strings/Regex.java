package strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String ipToTest = scan.nextLine();
            System.out.println(ipToTest.matches(new MyRegex().pattern));
        }
    }
}

    class MyRegex {
        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        String pattern = num + "." + num + "." + num + "." + num;
    }

