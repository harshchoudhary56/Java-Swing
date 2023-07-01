import javax.swing.*;
import java.awt.event.*;
public class UnitConverter {
    private class ConvertButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fromUnitType = fromUnit.getSelectedItem().toString();
            String toUnitType = toUnit.getSelectedItem().toString();
            double inputValue = Double.parseDouble(input.getText());
            double outputValue = 0.0;
            if(fromUnitType.equals("Meters")) {
                if(toUnitType.equals("Meters")) {
                    outputValue = metersToMeters(inputValue);
                } else if(toUnitType.equals("Feet")) {
                    outputValue = metersToFeet(inputValue);
                } else if(toUnitType.equals("Inches")) {
                    outputValue = metersToInches(inputValue);
                } else {
                    outputValue = metersToCentimeters(inputValue);
                }
            } else if(fromUnitType.equals("Inches")) {
                if(toUnitType.equals("Meters")) {
                    outputValue = inchesToMeters(inputValue);
                } else if(toUnitType.equals("Feet")) {
                    outputValue = inchesToFeet(inputValue);
                } else if(toUnitType.equals("Inches")) {
                    outputValue = inchesToInches(inputValue);
                } else {
                    outputValue = inchesToCentimeters(inputValue);
                }
            } else if(fromUnitType.equals("Feet")) {
                if(toUnitType.equals("Meters")) {
                    outputValue = feetToMeters(inputValue);
                } else if(toUnitType.equals("Feet")) {
                    outputValue = feetToFeet(inputValue);
                } else if(toUnitType.equals("Inches")) {
                    outputValue = feetToInches(inputValue);
                } else {
                    outputValue = feetToCentimeters(inputValue);
                }
            } else {
                if(toUnitType.equals("Meters")) {
                    outputValue = centimetersToMeters(inputValue);
                } else if(toUnitType.equals("Feet")) {
                    outputValue = centimetersToFeet(inputValue);
                } else if(toUnitType.equals("Inches")) {
                    outputValue = centimetersToInches(inputValue);
                } else {
                    outputValue = centimetersToCentimeters(inputValue);
                }
            }
            output.setText("" + outputValue);

        }
    }
    private JFrame frame;
    private JLabel inputLabel, outputLabel;
    private JTextField input, output;
    private JComboBox<String> fromUnit, toUnit;
    private JButton convertButton;

    public void initComponents() {
        frame = new JFrame("Unit Converter");
        
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        inputLabel = new JLabel("Input: ");
        input = new JTextField();
        outputLabel = new JLabel("Output: ");
        output = new JTextField();
        output.setEditable(false);
        fromUnit = new JComboBox<String>(new String[] {"Meters", "Feet", "Inches", "Centimeters"});
        toUnit = new JComboBox<String>(new String[] {"Meters", "Feet", "Inches", "Centimeters"});

        inputLabel.setBounds(20, 30, 100, 20);
        input.setBounds(150, 30, 100, 20);
        fromUnit.setBounds(300, 30, 100, 20);
        outputLabel.setBounds(20, 60, 100, 20);
        output.setBounds(150, 60, 100, 20);
        toUnit.setBounds(300, 60, 100, 20);
        convertButton = new JButton("Convert");
        convertButton.setBounds(150, 90, 100, 20);

        convertButton.addActionListener(new ConvertButtonListener());
        frame.add(inputLabel);
        frame.add(input);
        frame.add(fromUnit);
        frame.add(outputLabel);
        frame.add(output);
        frame.add(toUnit);
        frame.add(convertButton);
        frame.setVisible(true);

    }

    public UnitConverter() {
        initComponents();
    }

    public static double metersToMeters(double input) {
        double output = input;
        return output;
    }
    public static double metersToFeet(double input) {
        double output = input * 3.28084;
        return output;
    }
    public static double metersToInches(double input) {
        double output = input * 3.28084 * 12;
        return output;
    }
    public static double metersToCentimeters(double input) {
        double output = input * 100;
        return output;
    }

    public static double feetToMeters(double input) {
        double output = input / 3.28084;
        return output;
    }
    public static double feetToFeet(double input) {
        double output = input;
        return output;
    }
    public static double feetToInches(double input) {
        double output = input * 12;
        return output;
    }
    public static double feetToCentimeters(double input) {
        double output = input * 12 * 2.54;
        return output;
    }

    public static double inchesToMeters(double input) {
        double output = input / (12 * 3.28084);
        return output;
    }
    public static double inchesToFeet(double input) {
        double output = input / 12;
        return output;
    }
    public static double inchesToInches(double input) {
        double output = input;
        return output;
    }
    public static double inchesToCentimeters(double input) {
        double output = input * 2.54;
        return output;
    }

    public static double centimetersToMeters(double input) {
        double output = input / 100;
        return output;
    }
    public static double centimetersToFeet(double input) {
        double output = input / 100 * 3.28084;
        return output;
    }
    public static double centimetersToInches(double input) {
        double output = input / 2.54;
        return output;
    }
    public static double centimetersToCentimeters(double input) {
        double output = input;
        return output;
    }
    
    public static void main(String[] args) {
        new UnitConverter();
    }
     
}
