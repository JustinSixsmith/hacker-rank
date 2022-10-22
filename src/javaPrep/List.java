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
        for (int i = 0; i <= queries; i++) {
            String query = sc.nextLine();

            if (query.equals("Insert")) {
                list.add(sc.nextInt(), sc.nextInt());
            }

            if (query.equals("Delete")) {
                list.remove(sc.nextInt());
            }
        }

        for (Integer num : list) {
            System.out.printf("%d ", num);
        }
    }
}
