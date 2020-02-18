import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Patterns extends JFrame {

    private JLabel label1;
    private JLabel label2;


    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public Patterns() {
        super("Sum");

        setLayout(new FlowLayout());

        textField1 = new JTextField(15);
        add(textField1);

        label1 = new JLabel("+");
        add(label1);
        textField2 = new JTextField(15);
        add(textField2);

        label2 = new JLabel("= ");
        add(label2);
        textField3 = new JTextField(15);
        add(textField3);


        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                int sum = Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText());
                textField3.setText(Integer.toString(sum));
            }
        });
        add(button);


        JButton button1 = new JButton("Red");
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event1) {
                String output = "Red";
                JOptionPane.showMessageDialog(null, output, "Output", JOptionPane.INFORMATION_MESSAGE);
                textField3.setBackground(Color.RED);
            }
        });
        add(button1);

        JButton button2 = new JButton("Blue");
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event2) {
                String output1 = "Blue";
                JOptionPane.showMessageDialog(null, output1, "Output", JOptionPane.INFORMATION_MESSAGE);
                textField3.setBackground(Color.BLUE);
            }
        });
        add(button2);

        JButton button3 = new JButton("Green");
        button3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event3) {
                String output2 = "Green";
                JOptionPane.showMessageDialog(null, output2, "Output", JOptionPane.INFORMATION_MESSAGE);
                textField3.setBackground(Color.GREEN);
            }
        });
        add(button3);

    }

    public static void main(String[] args) {

        Patterns main = new Patterns();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
        main.setSize(700, 150);
    }

}
