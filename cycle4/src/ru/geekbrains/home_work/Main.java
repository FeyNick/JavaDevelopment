package ru.geekbrains.home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int [] [] a = new int [3][3];
        getArr(a); //я писал массив из консоли
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(i == j)
                    a[i][j] = 1;
            }
        }
       printArr(a);
    }
    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void getArr(int[][] arr){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
                }
            }
    }
}
