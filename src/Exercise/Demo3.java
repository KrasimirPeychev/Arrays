package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // numbers 10 15 20 25 30
        //.mapToInt(Integer::parseInt)

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        System.out.println();
//        int[] numbers = new int[5];
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            numbers[i] = scanner.nextInt();
            //Kaloyan Peter Sofia Plamen
            // String[] names = scanner.nextLine().split("\\s+");
            //System.out.println();
//        for (int i = 0; i <= names.length - 1; i++) {
//            names[i] = scanner.nextLine();

//        names[0] = scanner.nextLine();
//        names[1] = scanner.nextLine();
//        names[2] = scanner.nextLine();
//        names[3] = scanner.nextLine();

        }
    }

