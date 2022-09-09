package org.example;


public class App{


    public static void main(String[]args)



    {
        System.out.println(fibonazzi(7));}



    public static long fibonazzi(int n){
       if (n==0)return 0;
    return n<=2?1:fibonazzi(n-2)+fibonazzi(n-1);}

    }




