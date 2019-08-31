import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    Integer value1 = 0, value2 = 0;
    String operation = "";

    public Calculator() {
        super("Calculator");
        setVisible(true);
        setBounds(500, 250, 200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel container = new JPanel();
        container.setLayout(new GridLayout(2,1));
        add(container);

        JPanel jPanel1 = new JPanel();
//        jPanel1.setPreferredSize(new Dimension(200, 100));
//        jFrame.add(jPanel1);

        JTextField textField = new JTextField(8);
        textField.setFont(textField.getFont().deriveFont(25f));
        jPanel1.add(textField);

        JPanel jPanel2 = new JPanel();
//        jPanel2.setPreferredSize(new Dimension(200, 200));
//        jPanel2.setLocation(0, 200);
//        jFrame.add(jPanel2);

        container.add(jPanel1);
        container.add(jPanel2);

        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("+");
        JButton jButton5 = new JButton("4");
        JButton jButton6 = new JButton("5");
        JButton jButton7 = new JButton("6");
        JButton jButton8 = new JButton("-");
        JButton jButton9 = new JButton("7");
        JButton jButton10 = new JButton("8");
        JButton jButton11 = new JButton("9");
        JButton jButton12 = new JButton("*");
        JButton jButton13 = new JButton("<");
        JButton jButton14 = new JButton("0");
        JButton jButton15 = new JButton("=");
        JButton jButton16 = new JButton("/");

        jPanel2.add(jButton1);
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
        jPanel2.add(jButton4);
        jPanel2.add(jButton5);
        jPanel2.add(jButton6);
        jPanel2.add(jButton7);
        jPanel2.add(jButton8);
        jPanel2.add(jButton9);
        jPanel2.add(jButton10);
        jPanel2.add(jButton11);
        jPanel2.add(jButton12);
        jPanel2.add(jButton13);
        jPanel2.add(jButton14);
        jPanel2.add(jButton15);
        jPanel2.add(jButton16);
        jPanel2.setLayout(new GridLayout(0, 4, 5, 5));

        jPanel1.revalidate();

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "+";
                textField.setText("");
            }
        });

        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "-";
                textField.setText("");
            }
        });

        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "*";
                textField.setText("");
            }
        });

        jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "/";
                textField.setText("");
            }
        });

        jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value2 = Integer.valueOf(textField.getText());
                switch (operation) {
                    case ("+"):
                        textField.setText(Integer.toString(value1 + value2));
                        break;
                    case ("-"):
                        textField.setText(Integer.toString(value1 - value2));
                        break;
                    case ("*"):
                        textField.setText(Integer.toString(value1 * value2));
                        break;
                    case ("/"):
                        textField.setText(Integer.toString(value1 / value2));
                        break;
                }

            }
        });

        jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder(textField.getText());
                textField.setText(sb.substring(0, sb.length() - 1));
            }
        });

    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Calculator();
    }
}
