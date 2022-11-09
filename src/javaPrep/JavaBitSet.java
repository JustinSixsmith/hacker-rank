package javaPrep;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaBitSet {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        int m = get.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitset = new BitSet[3];

        bitset[1] = b1;
        bitset[2] = b2;

        while (0 < m--) {
            String operation_name = get.next();
            int x = get.nextInt();
            int y = get.nextInt();

            if (operation_name.equals("AND")) {
                bitset[x].and(bitset[y]);
            } else if (operation_name.equals("OR")) {
                bitset[x].or(bitset[y]);
            } else if (operation_name.equals("FLIP")) {
                bitset[x].flip(y);
            } else if (operation_name.equals("SET")) {
                bitset[x].set(y);
            } else if (operation_name.equals("XOR")) {
                bitset[x].xor(bitset[y]);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}

