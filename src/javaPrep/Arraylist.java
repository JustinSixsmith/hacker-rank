package javaPrep;

import java.util.*;

public class Arraylist<I extends Number> {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        // Take in number of lines
        int lines = sc.nextInt();

        // Create an array list of int arrays
        ArrayList<ArrayList<Integer>> numArrays = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            // Create an array of ints for each line input
            ArrayList<Integer> numArray = new ArrayList<>();
            int entries = sc.nextInt();
            for (int j = 0; j < entries; j++) {
                numArray.add(sc.nextInt());
            }
            numArrays.add(numArray);
        }

        int numQueries = sc.nextInt();
        for (int i = 0; i < numQueries; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            findNum(numArrays, x, y);
        }
        sc.close();
    }

    public static void findNum(ArrayList<ArrayList<Integer>> arr, int x, int y) {
        try {
            System.out.println(arr.get(x - 1).get(y - 1));
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }
}
