package hust.soict.dsai.Lab01.DaysInMonth.src;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter year: ");
            year = scanner.nextInt();
            if (year >= 0) {
                break;
            } else {
                System.out.println("Please enter a valid non-negative year.");
            }
        }

        scanner.nextLine();
        while (true) {
            System.out.print("Enter a month: ");
            monthInput = scanner.nextLine().toLowerCase();

            int days = timNgay(monthInput, year);
            if (days != 0) {
                break;
            } else {
                System.out.println("Please enter a valid month.");
            }
        }

        System.out.println("The number of days in " + monthInput + " " + year + " is: " + timNgay(monthInput, year));
    }

    public static boolean kiemTraNamNhuan(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int timNgay(String month, int year) {
        return switch (month) {
            case "january", "jan.", "jan", "1" -> 31;
            case "february", "feb.", "feb", "2" -> kiemTraNamNhuan(year) ? 29 : 28;
            case "march", "mar.", "mar", "3" -> 31;
            case "april", "apr.", "apr", "4" -> 30;
            case "may", "5" -> 31;
            case "june", "jun", "6" -> 30;
            case "july", "jul", "7" -> 31;
            case "august", "aug.", "aug", "8" -> 31;
            case "september", "sep.", "sep", "9" -> 30;
            case "october", "oct.", "oct", "10" -> 31;
            case "november", "nov.", "nov", "11" -> 30;
            case "december", "dec.", "dec", "12" -> 31;
            default -> 0;
        };
    }
}
