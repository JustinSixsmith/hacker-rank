package javaPrep;

import java.io.*;
import java.util.*;

public class List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int queries = sc.nextInt();
        while (queries > 0) {
            String query = sc.nextLine();

            if (query.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                if (index > list.size()) {
                    list.add(value);
                } else {
                    list.set(index, value);
                }
            }

            if (query.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }

            queries--;
        }
        sc.close();
        System.out.println(list);
    }
}
