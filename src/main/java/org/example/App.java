package org.example;


public class App {


    public static void main(String[] args) {

        System.out.println(isSimple(5));
    }


    public static int isSimple(int n) {


        for (int i = 2; i < n; i++) {

            if (n / i * i == n) {
                n = 1;
            } else {
                n = 0;
                break;
            }

        }

        return n;
    }
}
































