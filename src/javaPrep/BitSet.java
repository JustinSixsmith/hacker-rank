package javaPrep;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class BitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        final var lengthAndOps = Stream.of(sc.nextLine().split(" "));
        System.out.println(Arrays.toString(lengthAndOps.toArray()));

        sc.close();
    }
}
