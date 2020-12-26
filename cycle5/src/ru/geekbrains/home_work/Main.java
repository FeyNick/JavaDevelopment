package ru.geekbrains.home_work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min;
        int max;
        int [] a = setArr();
        min = a[0];
        max = a[0];
        for(int i = 1; i< a.length; i++)
        {
            if(a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Min: " + min);
        System.out.println();
        System.out.println("Max: " + max);
    }
    private static void getArr(int[] arr){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
        }
     private static int[] setArr ()
     {
         Scanner scanner = new Scanner(System.in);
         int length;
         System.out.println("Length: ");
         length = scanner.nextInt();
         int [] a = new int [length];
         System.out.println("Elements: ");
         getArr(a);
         return a;
     }
}

