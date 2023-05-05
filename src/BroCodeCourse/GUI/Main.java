package BroCodeCourse.GUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name? ");
        JOptionPane.showMessageDialog(null, "hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age ? "));
        JOptionPane.showMessageDialog(null, "your age is "+age);
    }
}
