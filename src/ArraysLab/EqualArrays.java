package ArraysLab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Arr = scanner.nextLine();
        String[] firstArr = Arr.split("\\s+");
        String Arr2 = scanner.nextLine();
        String[] secondArr = Arr.split("\\s+");

        boolean arraysAreEqual;
        int sum = 0;
        int differenceIndex = -1;
        if (firstArr.length != secondArr.length){
            arraysAreEqual = false;
            differenceIndex = Math.min(firstArr.length, secondArr.length);
        } else {
            arraysAreEqual = true;
            for (int i = 0; i < firstArr.length; i++) {
                
                if (firstArr[i] != secondArr[i])
                    arraysAreEqual = false;
            }
        }
    }
}
