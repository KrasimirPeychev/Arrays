package ArraysLab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();

        int[] numbers = new int[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = numbersCount - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
