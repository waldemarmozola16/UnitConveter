package tutorial;

import javax.swing.*;

public class UnitConverter {
    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Enter a number, a space, unit: in, cm, yd, m");
        int spacePos = userInput.indexOf(" ");
        double number = Double.parseDouble(userInput.substring(0, userInput.indexOf(" ")));
        String unit = userInput.substring(spacePos + 1, userInput.length()).trim();

        final double CENTIMETERS = 2.54;
        final double INCHES = .3937;

        double num = 0;
        String u = null;

        if (unit.equalsIgnoreCase("cm")) {
            num = number / CENTIMETERS;
            u = "in";
        } else if (unit.equalsIgnoreCase("in")) {
            num = number / INCHES;
            u = "cm";

        }
        System.out.println(number + " " + unit + " = " + num + " " + u);
    }
}
