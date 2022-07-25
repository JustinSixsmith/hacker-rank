package strings;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        String regex = "(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";

        Scanner scanner = new Scanner(System.in);
        int numNames = Integer.parseInt(scanner.nextLine());

        while (numNames-- > 0) {
            String input = scanner.nextLine();
        }


    }
}
