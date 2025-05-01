package level03.exercise01.utils;

import java.util.Scanner;
import java.util.function.Function;

/**
 * PROGRAM: ConsoleUtils
 * AUTHOR:  Diego Balaguer
 * DATE:    19/02/2025
 * <p>
 * PUBLIC METHODS AND VARIABLES:
 * readValueXXX(Scanner, message): Shows a message and returns the given value turned into
 * Int, Double, String or Long depending on the name of the function. If it is string, it is possible to return "".
 * readRequiredXXX(Scanner, message): Shows a message and returns the given value turned into Int, Double,
 * String or Long depending on the name of the function. In this function is not possible to be given an empty value.
 * <p>
 * USAGE:
 * <p>
 * To import this class into the necessary projects, we can do it in two ways:
 * <p>
 * **  import ConsoleUtils; or import ConsoleUtils.*;
 * <p>
 * This way, we have to call the methods from another class like this:
 * ConsoleUtils.readValueString("Message");
 * <p>
 * **  import static ConsoleUtils.*;
 * <p>
 * This way, we have to call the methods from another class like this:
 * readValueString("Message");
 * <p>
 * Doing it like the first example, we have visual info that the method is into another class and it can help us.
 * Doing it like the second example, the code is more compact.
 * Choose as needed.
 */

public class ConsoleUtils {

    private static final Scanner sc = new Scanner(System.in);

    public static void closeScanner() {
        sc.close();
    }

    // Functions readRequiredXX analyze that the inputs are not empty
    // In functions readValueXX you can press enter straightaway, but the numbers will be 0

    public static String readRequiredString(String message) {
        // Only controlling the value emptiness
        do {
            try {
                return readLineString(message);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private static String readLineString(String message) {
        String input = readValueString(message);
        if (input.isBlank()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        } else {
            return input;
        }
    }

    public static char readRequiredChar(String message) {

        do {
            String input = readRequiredString(message);
            try {
                lenghtChar(input.length());
                return input.charAt(0);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private static void lenghtChar(int length) throws IllegalArgumentException {

        if (length != 1) {
            throw new IllegalArgumentException("Only one character allowed.");
        }
    }

    public static <T> T readValue(String message, Function<String, T> parser) {
        do {
            try {
                String input = readRequiredString(message);
                return parser.apply(input);
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static int readRequiredInt(String message) {
        return readValue(message, Integer::parseInt);
    }

    public static long readRequiredLong(String message) {
        return readValue(message, Long::parseLong);
    }

    public static double readRequiredDouble(String message) {
        return readValue(message, Double::parseDouble);
    }

    public static float readRequiredFloat(String message) {
        return readValue(message, Float::parseFloat);
    }

    public static byte readRequiredByte(String message) {
        return readValue(message, Byte::parseByte);
    }

    public static short readShort(String message) {
        return readValue(message, Short::parseShort);
    }

    public static boolean readRequiredBoolean(String message) {

        do {
            char input = Character.toUpperCase(readRequiredChar(message));
            try {
                return calculateValueBoolean(input);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e);
            }
        } while (true);
    }

    private static boolean calculateValueBoolean(char valueBoolean) {

        return switch (valueBoolean) {
            case 'Y', 'T', 'S' -> true;
            case 'F', 'N' -> false;
            default -> throw new IllegalArgumentException("Only 'S', 'N', 'Y', 'N', 'T' or 'F' allowed.");
        };
    }

    public static String readValueString(String message) {

        System.out.println(message);
        return sc.nextLine();
    }

    public static <T> T readValueWithDefault(String message, T defaultValue, Function<String, T> parser) {
        do {
            String input = readValueString(message);
            input = input.isEmpty() ? defaultValue.toString() : input;

            try {
                return parser.apply(input);
            } catch (Exception e) {
                System.err.println("Error: input not valid (" + e.getMessage() + ").");
            }
        } while (true);
    }

    public static int readValueInt(String message) {
        return readValueWithDefault(message, 0, Integer::parseInt);
    }

    public static long readValueLong(String message) {
        return readValueWithDefault(message, 0L, Long::parseLong);
    }

    public static double readValueDouble(String message) {
        return readValueWithDefault(message, 0.0, Double::parseDouble);
    }

    public static float readValueFloat(String message) {
        return readValueWithDefault(message, 0.0f, Float::parseFloat);
    }

    public static byte readValueByte(String message) {
        return readValueWithDefault(message, (byte) 0, Byte::parseByte);
    }

    public static int valueIntWithoutException(String message) {
        do {
            String input = readRequiredString(message);
            if (NumberUtils.isNumber(input)) {
                return Integer.parseInt(input);
            }
        } while (true);
    }
}
