package hust.soict.dsai.Lab01.SortArrCalSumAverage.src;

import java.util.Arrays;

public class SortArrCalSumAverage {
    public static void main(String[] args) {
        int[] myArray = {1789, 2035, 1899, 1456, 2013};

        Arrays.sort(myArray);

        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }

        double average = (double) sum / myArray.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
