package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int multiplier = 1;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = N * multiplier;
            System.out.println(N + " x " + multiplier + " = " + result);
            multiplier++;
        }

        bufferedReader.close();
    }
}
