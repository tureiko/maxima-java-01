
package org.example;
public class App {

    public static void main(String[] args) {
        int [] arr = {43,92,93,39,11};
        System.out.println(maxDigitsSumPosition(arr));
    }
    public static byte maxDigitsSumPosition(int[] arr) {
        byte indexmax = 0;
        int[] arrNums = new int[arr.length];
        int num=arrNums[0];
        for (int i = 0; i < arr.length; i++) {
            int counter = arr[i];
            int sum=0;
            int n = counter;
            int sumDig=0;
            while (n != 0) {
                sum = sum + (n % 10);       //Суммирование цифр числа
                n = n / 10;
                sumDig = sum;
               arrNums[i] = sumDig;

                if (num<=sumDig) {
                   num= sumDig;
                    indexmax = (byte) i;
                }
            }
        }
        return indexmax;
    }}



































