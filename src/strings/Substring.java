package strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String indexStr = sc.nextLine();
        String[] indices = indexStr.split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int endingIndex = Integer.parseInt(indices[1]);
        System.out.println(s.substring(firstIndex, endingIndex));
        sc.close();
    }
}
