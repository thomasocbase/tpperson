package helpers;

import java.util.Scanner;

import static helpers.DisplayData.displayError;
import static helpers.ValidateData.validateString;

public class InputData {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        String s = scanner.nextLine();

        while (!validateString(s)) {
            displayError("Please enter a string with less than 50 characters.");
            s = scanner.nextLine();
        }

        return s;
    }

    public static int inputInt() {
        int i = 0;
        boolean ok = false;

        do {
            try {
                i = Integer.parseInt(scanner.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                displayError("Please enter a number.");
            }
        } while (!ok);

        return i;
    }

    public static int inputInt(int min, int max) {
        int i = 0;
        boolean ok = false;

        do {
            i = inputInt();

            if (i < min || i > max) {
                displayError("Please enter a number between " + min + " and " + max + ".");
            } else {
                ok = true;
            }
        } while (!ok);

        return i;
    }

    public static boolean inputBoolean() {
        boolean b = false;
        boolean ok = false;

        do {
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("yes") || input.equals("y")) {
                b = true;
                ok = true;
            } else if (input.equals("no") || input.equals("n")) {
                b = false;
                ok = true;
            } else {
                displayError("Please enter 'yes' or 'no'.");
            }
        } while (!ok);

        return b;
    }
}
