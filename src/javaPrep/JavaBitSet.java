package javaPrep;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaBitSet {
    enum Operation {
        AND("ANd"),
        OR("OR"),
        XOR("XOR"),
        FLIP("FLIP"),
        SET("SET");

        final String name;

        Operation(String name) {
            this.name = name;
        }
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
                    switch (Operation.valueOf(input[0])) {
                        case AND: bitsets[i1].and(bitsets[i2 - 1]);
                        case OR: bitsets[i1].or(bitsets[i2 - 1]);
                        case XOR: bitsets[i1].xor(bitsets[i2 - 1]);
                        case FLIP: bitsets[i1].flip(i2);
                        case SET: bitsets[i1].set(i2);
                    }
                });


        sc.close();
    }
}
