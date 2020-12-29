package ru.geekbrains.home_work.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	a += b; //сумма чисел, чтобы проще писать в условии
	if( a >= 10 && a <= 20)
        System.out.println("true");
	else
        System.out.println("false");
    }
}
