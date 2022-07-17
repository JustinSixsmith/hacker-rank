package strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B = new StringBuilder();
        for (int i = A.length() -1; i >= 0 ; i--) {
            B.append(A.charAt(i));
        }
        if (String.valueOf(B).equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
