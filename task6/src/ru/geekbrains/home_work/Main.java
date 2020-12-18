package ru.geekbrains.home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        checker(a);
    }
    // отрицательное - true, положительное - false
    private static boolean checker (int a){
        boolean bool = (a < 0);
        //System.out.println(bool); //отладочный вывод
       return bool;
    }
}
