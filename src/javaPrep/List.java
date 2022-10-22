package javaPrep;

import java.io.*;
import java.util.*;

public class List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < listSize; i++){
            list.add(sc.nextInt());
        }

        int queries= sc.nextInt();
        for(int i=0; i < queries; i++) {
            String query= sc.next();
            if (query.equals("Insert")) {
                list.add(sc.nextInt(), sc.nextInt());
            } else if (query.equals("Delete")) {
                list.remove(sc.nextInt());
            }
        }

        for(Integer i: list){
            System.out.printf("%d ",i);
        }
    }
}
