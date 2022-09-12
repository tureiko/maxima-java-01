package org.example;


public class App {


    public static void main(String[] args) {

         System.out.println( daysCount(2,2020));}

    public static byte daysCount(int month,int year){
        byte result;
        switch (month){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result =31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result=30;
                break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    result=29;}
                else{
                    result=28;}


                break;
            default: throw new IllegalStateException("Unexpected value: " + month);
        }       return result;
    }


        }


























