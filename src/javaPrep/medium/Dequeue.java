package javaPrep.medium;

import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Object> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (!deque.contains(num)) {
                deque.add(num);
            }
        }
        System.out.println(deque.size());
    }
}




