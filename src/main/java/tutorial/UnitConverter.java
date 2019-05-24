package tutorial;

import javax.swing.*;

public class UnitConverter {

    private static final double CENTIMETERS = 2.54;
    private static final double INCHES = .3937;

    private static final String INCH_UNIT = "in";
    private static final String CENTIMETER_UNIT = "cm";

    private static final String INPUT_TEXT = "Enter a number, a space, unit: in, cm, yd, m";

    public static void main(String[] args) {

        String userInput = getUserInput();
        String[] dividedUserInput = userInput.split(" ");

        double userValue = getNumber(dividedUserInput);
        String userUnits = getUnit(dividedUserInput);

        String converted = convert(userValue, userUnits);

        printConversion(userInput, converted);
    }

    private static String convert(double userValue, String unit) {
        if (unit.equalsIgnoreCase(CENTIMETER_UNIT)) return userValue / CENTIMETERS + " " + INCH_UNIT;
        if (unit.equalsIgnoreCase(INCH_UNIT)) return userValue / INCHES + " " + CENTIMETER_UNIT;
        return "Couldn't find proper unit in user Input!";
    }


    private static String getUnit(String[] dividedUserInput) {
        return dividedUserInput[0];
    }

    private static double getNumber(String[] dividedUserInput) {
        return Double.parseDouble(dividedUserInput[0]);
    }

    private static String getUserInput() {
        return JOptionPane.showInputDialog(INPUT_TEXT);
    }

    private static void printConversion(String userInput, String converted) {
        System.out.println(userInput + " = " + converted);
    }

}