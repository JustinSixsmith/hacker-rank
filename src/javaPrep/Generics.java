package javaPrep;

import java.io.*;
import java.util.*;

public class Generics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int intLength = sc.nextInt();
        int[] numbers = new int[intLength];
        for (int i = 0; i < intLength; i++) {
            numbers[i] = sc.nextInt();
        }

        int wordLength = sc.nextInt();
        String[] words = new String[wordLength];
        for (int i = 0; i < wordLength; i++) {
            words[i] = sc.nextLine();
        }

        printArray(numbers, words);
        sc.close();
    }

    public static void printArray(int[] numbers, String[] words) {
        for (int number : numbers) {
            System.out.println(number);
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
