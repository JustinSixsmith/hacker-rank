package javaPrep;

import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println(negativeSubarrays(arr));
    }
    private static int negativeSubarrays(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
