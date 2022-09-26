package week3;

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


//If seconds are less than 2 (0, 1) that means the state is not changed.
//        If the second is an even number that means the whole grid is planted with bombs.
//        So any real calculation you need to do only 3, 5, 7, 9,. . .
//        You get the grid state for the nth seconds when you detonate bombs from the previous odd second's state on a fully planted grid.
//        So, to calculate the 3rd-second state you have to detonate bombs from the 1-second grid (initial state) on a fully planted grid.
//        But, If you simulate a couple of examples on a paper you will see the state of the 3rd and 5th seconds are repeating on each odd second. So by only calculating the 3rd and 5th states, you can get any odd number. if (n-3)%4 = 0 that means state is the 3rd second state and if (n-5)%4 = 0 that means it's 5th second state.

class BombermanResult {

    /*
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here

        if (n < 2) {
            return grid;
        }

        List<String> stringGrid = new ArrayList<>();

        if (n % 2 == 0) {
            for (int i = 0; i < grid.size(); i++) {
                String newRow = grid.get(i).replaceAll("\\.", "O");
                stringGrid.add(newRow);
            }
            return stringGrid;
        }
        if ((n - 1) % 4 != 0) {
            return explode(grid);
        }
        return explode(explode(grid));
    }

    public static List<String> explode(List<String> grid) {
        List<String> newGrid = new ArrayList<>();

        List<List<Character>> arrayList = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            List<Character> charArray = new ArrayList<>();
            for (int j = 0; j < grid.get(i).length(); j++) {
                charArray.add(grid.get(i).charAt(j));
            }
            arrayList.add(charArray);
        }
        System.out.println(arrayList);


        for (int i = 0; i < arrayList.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arrayList.get(i).size(); j++) {

                if (!(arrayList.get(i - 1) == null) &&
                        !(arrayList.get(i + 1) == null) &&
                        !(arrayList.get(j - 1) == null) &&
                        !(arrayList.get(j + 1) == null)) {
                    if (arrayList.get(i).get(j) == 'O' ||
                            arrayList.get(i - 1).get(j) == 'O' ||
                            arrayList.get(i + 1).get(j) == 'O' ||
                            arrayList.get(i).get(j - 1) == 'O' ||
                            arrayList.get(i).get(j + 1) == 'O') {
                        sb.append('.');
                    } else {
                        sb.append('O');
                    }
                } else if (!(arrayList.get(i - 1) == null) &&
                        !(arrayList.get(i + 1) == null) &&
                        !(arrayList.get(i).get(j + 1) == null)) {
                    if (arrayList.get(i).get(j) == 'O' ||
                            arrayList.get(i - 1).get(j) == 'O' ||
                            arrayList.get(i + 1).get(j) == 'O' ||
                            arrayList.get(i).get(j + 1) == 'O') {
                        sb.append('.');
                    } else {
                        sb.append('O');
                    }
                } else if (!(arrayList.get(i - 1) == null) &&
                        !(arrayList.get(i + 1) == null) &&
                        !(arrayList.get(j - 1) == null)) {
                    if (arrayList.get(i).get(j) == 'O' ||
                            arrayList.get(i - 1).get(j) == 'O' ||
                            arrayList.get(i + 1).get(j) == 'O' ||
                            arrayList.get(i).get(j - 1) == 'O') {
                        sb.append('.');
                    } else {
                        sb.append('O');
                    }
                } else if (!(arrayList.get(i + 1) == null) &&
                        !(arrayList.get(j + 1) == null)) {
                    if (arrayList.get(i).get(j) == 'O' ||
                            arrayList.get(i + 1).get(j) == 'O' ||
                            arrayList.get(i).get(j + 1) == 'O') {
                        sb.append('.');
                    } else {
                        sb.append('O');
                    }
                } else if (!(arrayList.get(i - 1) == null) &&
                        !(arrayList.get(j + 1) == null)) {
                    if (arrayList.get(i).get(j) == 'O' ||
                            arrayList.get(i - 1).get(j) == 'O' ||
                            arrayList.get(i).get(j + 1) == 'O') {
                        sb.append('.');
                    } else {
                        sb.append('O');
                    }
                } else if (!(arrayList.get(i + 1) == null) &&
                        !(arrayList.get(j - 1) == null)) {
                    if (arrayList.get(i).get(j) == 'O' ||
                            arrayList.get(i + 1).get(j) == 'O' ||
                            arrayList.get(i).get(j - 1) == 'O') {
                        sb.append('.');
                    } else {
                        sb.append('O');
                    }
                } else if (!(arrayList.get(i - 1) == null) &&
                        !(arrayList.get(j - 1) == null)) {
                    if (arrayList.get(i).get(j) == 'O' ||
                            arrayList.get(i - 1).get(j) == 'O' ||
                            arrayList.get(i).get(j - 1) == 'O') {
                        sb.append('.');
                    } else {
                        sb.append('O');
                    }
                }


            }
            String newRow = sb.toString();
            newGrid.add(newRow);
        }
        return newGrid;
    }

}

public class theBombermanGame {
    public static void main(String[] args) throws IOException {

        List<String> grid = new ArrayList<>(Arrays.asList(".......", "...O...", "....O..", ".......", "OO.....", "OO....."));

        System.out.println(BombermanResult.bomberMan(3, grid));


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int r = Integer.parseInt(firstMultipleInput[0]);
//
//        int c = Integer.parseInt(firstMultipleInput[1]);
//
//        int n = Integer.parseInt(firstMultipleInput[2]);
//
//        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        List<String> result = BombermanResult.bomberMan(n, grid);
//
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

