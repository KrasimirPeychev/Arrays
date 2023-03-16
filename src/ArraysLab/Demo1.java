package ArraysLab;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();

        String[] numbersAsStrings = lineOfNumbers.split(" ");

        int[] numbers = new int[numbersAsStrings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }
    }
}
