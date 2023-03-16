package Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String elementsOfsecondArr : secondArr) {
            for (String elementsOffirstArr : firstArr) {
                if (elementsOfsecondArr.equals(elementsOffirstArr)) {
                    System.out.print(elementsOffirstArr + " ");
                }
            }
        }
    }
}
