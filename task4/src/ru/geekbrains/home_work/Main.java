package ru.geekbrains.home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0)
            System.out.println("оно отрицательное!");
        else
            System.out.println("оно  положительное!");
    }
}
