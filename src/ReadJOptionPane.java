import javax.swing.*;

public class ReadJOptionPane{
    public static void main(String[] args) {
        String name;
        String surname;

        name = JOptionPane.showInputDialog("Enter your name: ");
        surname = JOptionPane.showInputDialog("Enter your surname: ");

        JOptionPane.showMessageDialog(null, "Hello, " + name + " " + surname);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");

        int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your weight: "));
        JOptionPane.showMessageDialog(null, "You are " + weight + " kg heavy.");

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        int thirdNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter third number: "));

        JOptionPane.showMessageDialog(null, "The sum of the numbers is " + (firstNumber + secondNumber + thirdNumber));

        int fourthNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter fourth number: "));
        int fifthNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter fifth number: "));
        int sixthNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter sixth number: "));

        JOptionPane.showMessageDialog(null, "The sum of the numbers is " + (fourthNumber + fifthNumber + sixthNumber));

        double firstNumberDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter first number: "));
        double secondNumberDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter second number: "));
        double thirdNumberDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter third number: "));

        JOptionPane.showMessageDialog(null, "The sum of the numbers is " + (firstNumberDouble + secondNumberDouble + thirdNumberDouble));
        double avarage = (firstNumberDouble + secondNumberDouble + thirdNumberDouble) / 3;
        JOptionPane.showMessageDialog(null, "The avarage of the numbers is " + avarage);



    }

}