package javaPrep;

import java.util.*;

public class AnotherArray {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
//        System.out.println(Arrays.toString(Arrays.stream(game).toArray()));
        boolean win = true;
        for (int i = 0; i < game.length; i++) {
            if (game[i] != 0) {
                if (i + leap > game.length) {
                    break;
                }
                leap = i + leap;
                int flag = 0;
                for (int j = i; j <= leap; j++) {
                    if (game[j] == 0) {
                        i = j;
                        flag++;
                    }
                    if (flag == 0) {
                        win = false;
                    }
                }
            }
        }
        return win;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
