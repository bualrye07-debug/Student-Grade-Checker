import javax.swing.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        // Create a new JFrame with a title
        JFrame frame = new JFrame("My First JFrame");

        // Add a label to the frame
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);

        // Add glabel
        JLabel glabel = new JLabel("Welcome to Calculator!");

        // Add JButton
        JButton button = new JButton("Click Me");
        frame.add(button);

        // Set size and default close operation
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}