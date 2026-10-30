import java.awt.*;
import javax.swing.*;
public class calculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First JFrame");
        frame.setSize(500,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);

        JButton button = new JButton("Click Me");
        JButton clearButton = new JButton("Clear");
        JLabel glabel = new JLabel("Welcome to Calculator!");
        JButton buttons = new JButton("Click Me");
        JTextField numField = new JTextField();
        numField.setBounds(100,50,200,30);
        frame.add(numField);
        frame.add(button);
        frame.add(buttons);
        frame.add(clearButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true)




    }
}
