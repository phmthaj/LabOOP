package hust.soict.dsai.Lab01.javabasic;

import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + name + "!");
        System.exit(0);
    }
}
