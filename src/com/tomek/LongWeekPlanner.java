package com.tomek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class LongWeekPlanner {
    public static void main(String[] args) {

        System.out.println("Wpisz datę dnia wolnego: \nrrrr-mm-dd");
        Scanner scanner = new Scanner(System.in);
        LocalDate freeDay = LocalDate.parse(scanner.nextLine());
        LocalDate prevFriday = freeDay.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        LocalDate nextFriday = freeDay.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.println("Wolny dzień to: " + freeDay.getDayOfWeek());
        System.out.println("Piątek przed dniem wolnym wypada: " + prevFriday);
        System.out.println("Piątek po dniem wolnym wypada: " + nextFriday);
    }
}
