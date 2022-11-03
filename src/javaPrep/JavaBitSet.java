package javaPrep;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaBitSet {
    enum Operation {
        OR("OR"),
        XOR("XOR"),
        AND
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] firstLine = Stream.of(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = firstLine[0];
        int m = firstLine[1];
        BitSet[] bitsets = new BitSet[]{new BitSet(n), new BitSet(n)};

        String output = IntStream.range(0, m)
                .mapToObj(i -> {
                    String[] input = sc.nextLine().split(" ");
                    int i1 = Integer.parseInt(input[1]) - 1;
                    int i2 = Integer.parseInt(input[2]);
                    case ()
                });


        sc.close();
    }
}
