package com.tomek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer number = -1;

        while (number != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Napisz liczbę różną od zera!");
            number = scanner.nextInt() * 2;
            System.out.println("Twoja liczba powiększona dwa razy: " + number + "\n************************");
        }
        System.out.println("Wpisałeś zero!");
    }
}
