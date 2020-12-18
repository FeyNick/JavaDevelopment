package ru.geekbrains.home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean bool;
        if (year%400 == 0)
            bool = true;
        else if(year%4 == 0 && year%100 != 0)
            bool = true;
        else
            bool = false;
        System.out.println(bool);
    }
}
