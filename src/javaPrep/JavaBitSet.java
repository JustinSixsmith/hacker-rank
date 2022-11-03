package javaPrep;

import java.util.*;
import java.util.stream.Stream;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        final var firstLine = Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        final var n = firstLine[0];
        final var m = firstLine[1];
        final var bitsets = new BitSet[]{new BitSet(n), new BitSet(n)};



        sc.close();
    }
}
