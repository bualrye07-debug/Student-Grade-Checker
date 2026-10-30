import java.awt.*;
import javax.swing.*;
public class calculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First JFrame");
        frame.setSize(500,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        
        JLabel lblnum1 = new JLabel("1st number: ");
        lblnum1.setBounds(0,30,80,25);
        JTextField txtnum1 = new JTextField(5);
        txtnum1.setBounds(0, 0, 0, 0);
        JLabel lblnum2 = new JLabel("2nd number: ");
        lblnum1.setBounds(0,30,80,25);
        JTextField txtnum2 = new JTextField(5);
        txtnum1.setBounds(0, 0, 0, 0);
        frame.add(lblnum1);
        frame.add(lblnum1);

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
