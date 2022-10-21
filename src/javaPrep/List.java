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
            sc.nextLine();
            String query = sc.nextLine();

            if (query.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                if (index < list.size()) {
                    list.set(index, value);
                } else {
                    list.add(value);
                }
            }

            if (query.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
            queries--;
        }
        sc.close();
        StringBuilder result = new StringBuilder();
        result.append(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            result.append(" ").append(list.get(i));
        }
        String stringResult = result.toString();
        System.out.println(stringResult);
    }
}
