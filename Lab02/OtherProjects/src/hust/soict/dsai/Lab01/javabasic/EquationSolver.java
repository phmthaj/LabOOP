package hust.soict.dsai.Lab01.javabasic;

import java.util.Scanner;

public class EquationSolver {

    public static void LiEquationOneVar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }

        scanner.close();
    }

    public static void LiEquationTwoVar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a11: ");
        double a = scanner.nextDouble();

        System.out.print("Enter a12: ");
        double b = scanner.nextDouble();

        System.out.print("Enter b1: ");
        double c = scanner.nextDouble();

        System.out.print("Enter a21: ");
        double d = scanner.nextDouble();

        System.out.print("Enter a22: ");
        double e = scanner.nextDouble();

        System.out.print("Enter b2: ");
        double f = scanner.nextDouble();

        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        scanner.close();
    }

    public static void SeDegEquationOneVar(){
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter c: ");
            double c = scanner.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("Infinite solutions.");
                    } else {
                        System.out.println("No solution.");
                    }
                } else {
                    double x = -c / b;
                    System.out.println("x = " + x);
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("No solution.");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }

            scanner.close();
        }
    }

    public static void main(String[] args) {
        //LiEquationOneVar();
        //LiEquationTwoVar();
        //SeDegEquationOneVar();
    }

}
