package test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calander {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        LocalDate curDay = now.minusDays(day - 1);
        DayOfWeek dayOfWeek = curDay.getDayOfWeek();
        int dayOfWeekInt = dayOfWeek.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 1; i < dayOfWeekInt; i++) {
            System.out.print("    ");
        }
        while (curDay.getMonthValue() == month) {
            System.out.printf("%3d", curDay.getDayOfMonth());

            if (curDay.getDayOfMonth() == day) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            curDay = curDay.plusDays(1);

            if (curDay.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

    }
}
