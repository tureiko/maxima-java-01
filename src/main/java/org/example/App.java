package org.example;


public class App{


    public static void main(String[]args){



        System.out.println(fibonazzi(0));}


    public static long fibonazzi(int n){

    return n<=1?n: fibonazzi(n-2)+fibonazzi(n-1);}

    }




