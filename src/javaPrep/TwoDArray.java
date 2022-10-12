package javaPrep;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class TwoDArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        System.out.println(hourglassSum(arr));
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int largestSum = -100;
        for (int i = 0; i < arr.size() / 2 + 1; i++) {
            for (int j = 0; j < arr.size() / 2 + 1; j++) {
                int sumLine1 = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int sumLine2 = arr.get(i + 1).get(j + 1);
                int sumLine3 = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int hourglassSum = sumLine1 + sumLine2 + sumLine3;
                if (hourglassSum > largestSum) {
                    largestSum = hourglassSum;
                }
            }
        }
        return largestSum;
    }
}

