package hust.soict.dsai.Lab01.JavaBasics.src;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name?");
        String strName = scanner.nextLine();
        System.out.println("How old are you?");
        int iAge = scanner.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = scanner.nextDouble();

        System.out.println("Mr/Ms. " + strName + ", " + iAge + " years old. " + "Height: " + dHeight + "m");
    }
}
