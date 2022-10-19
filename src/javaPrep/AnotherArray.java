package javaPrep;

import java.util.*;

public class AnotherArray {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
//        System.out.println(Arrays.toString(Arrays.stream(game).toArray()));
        boolean win = true;
        int pos = 0;
        while (pos < game.length) {
            if (game[0] != 0) {
                win = false;
                break;
            }
            if (pos + leap < game.length) {
                // Leap over things
                if (game[pos + leap] == 0) {
                    pos = pos + leap;
                } else {
                    win = false;
                    break;
                }
            }
            // Check if able to leap to end
            if (pos + leap >= game.length) {
                break;
            }
            pos++;
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
