package strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i <= s.length()-k; i++) {
            String sTemp = s.substring(i, i + k);
            if(sTemp.compareTo(smallest) < 0) {
                smallest = sTemp;
            }
            if(sTemp.compareTo(largest) > 0) {
                largest = sTemp;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
