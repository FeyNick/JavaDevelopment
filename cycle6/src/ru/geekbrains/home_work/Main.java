package ru.geekbrains.home_work;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean x;
        int[] a = new int [5];
       // int [] a = {2, 2, 2, 1, 2, 2, 10, 1};
        getArr(a);
        x = chekArr(a);
        System.out.println(x);
    }
    private static  boolean chekArr(int @NotNull [] arr){
        boolean res;
        res = false;
        int sum1 = arr[0]; //сумма с начала
        int sum2 = 0; // сумма с конца
        for (int i = (arr.length - 1); i > 0 ; i--)
        {
            sum2 += arr[i];
        }
        for (int i = 0; i < (arr.length-1); i++)
        {
            if(sum1 == sum2)
                res = true;
            else
            {
                sum1 += arr[i+1];
                sum2 -= arr[i+1];
            }
        }
        return res;
    }
    private static void getArr(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}
