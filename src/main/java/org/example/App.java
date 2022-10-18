package org.example;
public class App {

    public static void main(String[] args) {
        int [] arr = {43,81,92,14,22,51,18,29};
        System.out.println(+maxDigitsSumPosition(arr));
    }

    public static byte maxDigitsSumPosition(int[] arr) {
        byte indexmax = 0;
        byte indexmax1 = 0;
        int num = arr[0];
        int sumDig = 0;
        int[] arrNums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int counter = arr[i];
            int sum = 0;
            int n = counter;

            while (n != 0) {
                sum = sum + (n % 10);       //Суммирование цифр числа
                n = n / 10;
                sumDig = sum;
                arrNums[i] = sumDig;
            }

            if (num < counter) {
                num = counter;
                indexmax = (byte) i;
            }
        }
        int num1 = arrNums[0];
        for (int j = 0; j < arrNums.length; j++) {
            int counter1 = arrNums[j];

           if (num1 <= counter1) {
                num1 = counter1;
                indexmax1 = (byte) j;
            }
        }
        return indexmax1;

    }
}














































