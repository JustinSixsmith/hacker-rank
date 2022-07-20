package strings;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        char[] a = scan.nextLine().toLowerCase().toCharArray();
        char[] b = scan.nextLine().toLowerCase().toCharArray();

        if (a.length != b.length) {
            System.out.println("Not Anagrams");
        } else {
            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);
            if (java.util.Arrays.equals(a, b)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
    }
}
