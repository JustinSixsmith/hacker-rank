package week2;

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

class GridResult {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here

        char[] charArray;

        for (int i = 0; i < grid.size(); i++) {
            charArray = grid.get(i).toCharArray();
            Arrays.sort(charArray);
            grid.set(i, String.valueOf(charArray));
            if (i > 0) {
                for (int j = 0; j < grid.get(i).length(); j++) {
                    if (grid.get(i).charAt(j) < grid.get(i - 1).charAt(j)) {
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}

public class GridChallenge {
    public static void main(String[] args) throws IOException {

        List<String> grid = new ArrayList<>(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv"));
        System.out.println(GridResult.gridChallenge(grid));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, t).forEach(tItr -> {
//            try {
//                int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
//                            try {
//                                return bufferedReader.readLine();
//                            } catch (IOException ex) {
//                                throw new RuntimeException(ex);
//                            }
//                        })
//                        .collect(toList());
//
//                String result = GridResult.gridChallenge(grid);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

