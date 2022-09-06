package org.example;


public class App{

    public static void main( String[] args )
    {
        byte a=10;
        byte b=110;
        byte c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
