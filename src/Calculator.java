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

        // У нас будет одна основная JPanel с Layout Manager'ом Border Layout, вверху будет текстовое поле, а по центру
        // будет еще одна JPanel с Layout Manager'ом - Grid Layout (табличная раскладка) для клавиш калькулятора
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        add(container);

        // добавляем текстовое поле наверху JPanel
        JTextField textField = new JTextField(8);
        textField.setFont(textField.getFont().deriveFont(25f));
        container.add(textField, BorderLayout.NORTH);

        // добавляем вторую JPanel с табличной раскладкой для клавиш калькулятора
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(0, 4, 5, 5));
        container.add(jPanel1, BorderLayout.CENTER);

        // добавляем клавиши калькулятора
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

        // добавляем клавиши на JPanel с табличной раскладкой
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jButton4);
        jPanel1.add(jButton5);
        jPanel1.add(jButton6);
        jPanel1.add(jButton7);
        jPanel1.add(jButton8);
        jPanel1.add(jButton9);
        jPanel1.add(jButton10);
        jPanel1.add(jButton11);
        jPanel1.add(jButton12);
        jPanel1.add(jButton13);
        jPanel1.add(jButton14);
        jPanel1.add(jButton15);
        jPanel1.add(jButton16);

        container.revalidate();

        // добавляем действия для нажатия клавиш калькулятора с цифрами. По нажатию добавляем цифру в текстовое поле
        // Это 1
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 2
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 3
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 4
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 5
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 6
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 7
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 8
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 9
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // Это 0
        jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton)e.getSource()).getText());
            }
        });

        // по нажатию операций +, - , *, /, запоминаем первое число из текстового поля, тип операции
        // и очищаем текстовое поле
        // для конвертации строки в целое число используем класс оболочку Integer
        // Это +
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "+";
                textField.setText("");
            }
        });

        // Это -
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "-";
                textField.setText("");
            }
        });

        // Это *
        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "*";
                textField.setText("");
            }
        });

        // Это /
        jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = Integer.valueOf(textField.getText());
                operation = "/";
                textField.setText("");
            }
        });

        // По нажатию кнопки =, считываем второе число из текстового поля, и в зависимости от типа операции
        // выполняем сложение, вычитание, умножение или деление. Результат выводим на текстовое поле
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

        // по нажатию клавиши <, стираем последний символ/цифру из текстового поля
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
