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

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).length(); j++) {
                if (grid.get(i).charAt(j) == 'O') {

                }
            }
        }

        

        return newGrid;
    }

}

public class theBombermanGame {
    public static void main(String[] args) throws IOException {

        List<String> grid = new ArrayList<>(Arrays.asList(".......", "...O...", "....O..", ".......", "OO.....", "OO....."));

        System.out.println(BombermanResult.bomberMan(2, grid));


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

