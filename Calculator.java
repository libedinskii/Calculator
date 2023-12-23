import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator2 implements ActionListener { // класс

    double num1 = 0;
    double num2 = 0;
    double result = 0; // переменные
    int calculation; // переменные

    JFrame frame = new JFrame("Calculator lib3A"); // название рамки
    JLabel label = new JLabel(); // этикетка
    JTextField textField = new JTextField(); // сам текси
    JRadioButton onRadioButtion = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");//переключатель
    JButton buttonZero = new JButton("0"); // кнопки
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonSinus = new JButton("sin");
    JButton buttonCosinu = new JButton("cos");
    JButton buttonTangent = new JButton("tg");
    JButton buttonEqual = new JButton("=");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonName = new JButton("Либединский Степан 3 А");

    Calculator2() { //класс

        prepareGui(); //
        addComonenets();
        addActionEvent();

    }

    public void prepareGui() {
        frame.setSize(305, 510); // размеры
        frame.getContentPane().setLayout(null); // нужен чтобы перетаскивать
        frame.getContentPane().setBackground(Color.black); // фон цвет
        frame.setLocationRelativeTo(null); // задает расположение окна
        frame.setVisible(true); // вижу само приложение
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // операция закрытия окна JFrame
    }

    public void addComonenets() {

        label.setBounds(245, 0, 50, 60); // установить границы
        label.setForeground(Color.white); // установить передний план
        frame.add(label); // добавляется в конце каждого конструктура

        textField.setBounds(10, 40, 270, 43);
        textField.setFont(new Font("Arial", Font.BOLD, 20)); // вид и размер шрифта
        textField.setEditable(false);// устанавливает указанное лог значение
        textField.setHorizontalAlignment(SwingConstants.RIGHT);// устанавливает уравнивание поля
        frame.add(textField);

        buttonName.setBounds(10, 10, 200, 25);
        buttonName.setFont(new Font("Arial", Font.BOLD, 10));
        buttonName.setFocusable(false);
        buttonName.setBackground(Color.white);
        frame.add(buttonName);

        onRadioButtion.setBounds(10, 95, 60, 40);
        onRadioButtion.setSelected(true);
        onRadioButtion.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButtion.setBackground(Color.black);
        onRadioButtion.setForeground(Color.white);
        onRadioButtion.setFocusable(false); // устанавливает указанное значение
        frame.add(onRadioButtion);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButtion);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 68, 58);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setBackground(Color.lightGray);
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 68, 58);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setBackground(Color.lightGray);
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 68, 58);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setBackground(Color.lightGray);
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFive.setBounds(80, 290, 68, 58);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setBackground(Color.lightGray);
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonFour.setBounds(10, 290, 68, 58);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setBackground(Color.lightGray);
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonSix.setBounds(150, 290, 68, 58);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setBackground(Color.lightGray);
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonThree.setBounds(150, 350, 68, 58);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setBackground(Color.lightGray);
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonTwo.setBounds(80, 350, 68, 58);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setBackground(Color.lightGray);
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);


        buttonOne.setBounds(10, 350, 68, 58);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setBackground(Color.lightGray);
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonZero.setBounds(10, 410, 68, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setBackground(Color.lightGray);
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonDot.setBounds(150, 410, 68, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setBackground(Color.lightGray);
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonEqual.setBounds(220, 350, 66, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setFocusable(false);
        buttonEqual.setBackground(new Color(239, 188, 2));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 66, 58);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setFocusable(false);
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 68, 58);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(Color.lightGray);
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttonMultiply.setBounds(220, 230, 66, 58);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMultiply.setFocusable(false);
        buttonMultiply.setBackground(new Color(239, 188, 2));
        frame.add(buttonMultiply);

        buttonMinus.setBounds(220, 170, 66, 58);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setFocusable(false);
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 66, 58);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setFocusable(false);
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 68, 58);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(Color.lightGray);
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonSinus.setBounds(150, 170, 68, 58);
        buttonSinus.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSinus.setBackground(Color.lightGray);
        buttonSinus.setFocusable(false);
        frame.add(buttonSinus);

        buttonCosinu.setBounds(150, 110, 68, 58);
        buttonCosinu.setFont(new Font("Arial", Font.BOLD, 15));
        buttonCosinu.setBackground(Color.lightGray);
        buttonCosinu.setFocusable(false);
        frame.add(buttonCosinu);

        buttonTangent.setBounds(80, 410, 68, 40);
        buttonTangent.setFont(new Font("Arial", Font.BOLD, 15));
        buttonTangent.setBackground(Color.lightGray);
        buttonTangent.setFocusable(false);
        frame.add(buttonTangent);

        buttonClear.setBounds(80, 110, 68, 58);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setFocusable(false);
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);


    }

    public void addActionEvent() {

        onRadioButtion.addActionListener(this); // добавляет действие к кнопке
        offRadioButton.addActionListener(this);
        buttonTangent.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonCosinu.addActionListener(this);
        buttonSinus.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonName.addActionListener(this);
    }

    public static void main(String[] argsw) { // метод

        Calculator2 calculator2 = new Calculator2();


    }


    @Override
    public void actionPerformed(ActionEvent e) { // метод
        try {
            action(e);
        } catch (Exception ex) {
            ex.printStackTrace();
            textField.setText("Ощибка");
        }

    }

    public void action(ActionEvent e) throws Exception {
        Object source = e.getSource(); // создали обьект


        if (source == onRadioButtion) { // функция, сами вычесление

            enable();
        } else if (source == offRadioButton) {
            disable();
        } else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) { // возвращает текст
                return;
            } else {
                textField.setText(textField.getText() + "0"); // выводится текст
            }

        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        } else if (source == buttonMinus) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        } else if (source == buttonDiv) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "/");
        } else if (source == buttonMultiply) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "*");
        } else if (source == buttonSquare) {
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }

        } else if (source == buttonSqrt) {
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        } else if (source == buttonSinus) {
            num1 = Double.parseDouble(textField.getText());
            double sinus = Math.sin(num1);
            textField.setText(Double.toString(sinus));
        } else if (source == buttonCosinu) {
            num1 = Double.parseDouble(textField.getText());
            double cosinu = Math.cos(num1);
            textField.setText(Double.toString(cosinu));
        } else if (source == buttonTangent) {
            num1 = Double.parseDouble(textField.getText());
            if (num1 == 90) {
                JOptionPane.showMessageDialog(null, "Не существует, попробуйте снова", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double tangent = Math.tan(num1);
            textField.setText(Double.toString(tangent));
        } else if (source == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());
            switch (calculation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Попробуйте снова", "Ошибка", JOptionPane.ERROR_MESSAGE);
                    }
                    result = num1 / num2;
                    break;
                case 4:
                    result = num1 * num2;
                    break;
            }
            if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;

        }

    }


    public void enable() {

        onRadioButtion.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonMultiply.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonCosinu.setEnabled(true);
        buttonSinus.setEnabled(true);
        buttonTangent.setEnabled(true);
        buttonName.setEnabled(true);

    }

    public void disable() {
        onRadioButtion.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonMultiply.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonCosinu.setEnabled(false);
        buttonSinus.setEnabled(false);
        buttonTangent.setEnabled(false);
        buttonName.setEnabled(false);
    }
}
