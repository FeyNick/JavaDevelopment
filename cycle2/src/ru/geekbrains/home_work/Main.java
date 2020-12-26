package ru.geekbrains.home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int [] a = new int[8];
	    for(int i = 0; i < 8; i++)
	         a[i] = scanner.nextInt();
        for(int i = 0; i < 8; i++)
            System.out.println(a[i]);

    }
}
