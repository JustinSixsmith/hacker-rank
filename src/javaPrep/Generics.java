package javaPrep;

import java.io.*;
import java.util.*;

public class Generics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Object[] arr = {1, 2, 3, "Hello", "World"};
        printArray(arr);
    }

    private static void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}
