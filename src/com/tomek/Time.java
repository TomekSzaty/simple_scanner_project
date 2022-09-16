package com.tomek;

import java.time.LocalDate;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        System.out.println("\nWpisz datę aby poznać dzień tygodnia: \n(rrrr-mm-dd)");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        LocalDate myBirthDate = LocalDate.parse(line);
        System.out.println("Twoja data: " + myBirthDate);
        System.out.println("To był: " + myBirthDate.getDayOfWeek());
    }
}
