package ru.geekbrains.home_work;

public class Main {

    public static void main(String[] args) {
        int i = 0;
       int [] massive = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
     while( i < massive.length)
       {
           if(massive[i] == 0)
               massive[i] = 1;
           else
               massive[i] = 0;
           i++;
       }
    /*for(i = 0; i < massive.length; i++)
        System.out.println(massive[i]);         отладочная печать
        */
    }
}