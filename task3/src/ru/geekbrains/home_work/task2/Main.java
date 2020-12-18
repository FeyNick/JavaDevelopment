package ru.geekbrains.home_work.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        float t = scanner.nextFloat();
        computer(x, y, z, t); //второе задание

    }
    public static void computer(float a,float b, float c, float d){
        float res =  (a*(b+(c/d)));
        System.out.println(res);
    }
}

