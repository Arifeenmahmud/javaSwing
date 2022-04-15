package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       try{
           String input;
           int number;

           input = JOptionPane.showInputDialog("Enter a number");
           number = Integer.parseInt(input);
           if (number % 2 == 0) {
               JOptionPane.showMessageDialog(null, "The number is even");
           }
           else {
               JOptionPane.showMessageDialog(null, "The number is odd");
           }
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "You did not enter a number");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Something went wrong");
       }
    }
}
