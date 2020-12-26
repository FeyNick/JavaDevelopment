package ru.geekbrains.home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Length: ");
    int a = scanner.nextInt();
    int [] arr = new int[a];
    getArr(arr);
    System.out.println("Swap: ");
    int n = scanner.nextInt();
    arr = arrSwapper(arr, n);
    System.out.println("Result: ");
    printArr(arr);  // результат работы
    }

    private static void getArr(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elements: ");
        for (int i =0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    private static int[] arrSwapper(int[] arr, int n){
        int [] a = new int [arr.length];
        System.out.println("Start: ");
        printArr(arr);  //массив до изменений
        int j = 0;
        for(int i = (n-1); i < arr.length; i++)
        {
            if(j < a.length)
            {
                a[i] = arr[j];
                j++;
            }
        }
        for(int i = 0; i < (n-1); i++)
        {
            a[i] = arr[j];
            j++;
        }
        return a;
    }
}
