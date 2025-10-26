import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        int numberOne = Integer.parseInt(firstNumber);
        int numberTwo = Integer.parseInt(secondNumber);

        int sum = numberOne + numberTwo;

        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}