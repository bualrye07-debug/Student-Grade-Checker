import javax.swing.*;
public class calculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First JFrame");

        // Add a label to the frame
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);

        JButton button = new JButton("Click Me");
        JButton clearButton = new JButton("Clear");
        frame.add(button);
        frame.add(clearButton);
    }
}
