package org.example;


public class App {


    public static void main(String[] args) {

        System.out.println(isSimple(10));
    }
    public static int isSimple(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return i;}
        }return  0;
    }
}































