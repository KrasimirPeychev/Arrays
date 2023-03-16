package Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];
        for (int i = 1; i <= n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstArr[i - 1] = line[0];
                secondArr[i - 1] = line[1];
            } else {
                firstArr[i - 1] = line[1];
                secondArr[i - 1] = line[0];
            }
        }
        // ako masiva e String mojem da polzvame i String.join
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));

//        for (int i = 0; i < firstArr.length; i++) {
//            System.out.print(firstArr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < secondArr.length; i++) {
//            System.out.print(secondArr[i] + " ");
//        }

    }
}
