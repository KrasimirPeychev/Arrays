package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());
        String[] daysOfWeek = {"Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (dayNumber >= 1 && dayNumber <= 7){
            System.out.println(daysOfWeek[dayNumber]);
        } else {
            System.out.println(daysOfWeek[0]);
        }
    }
}
