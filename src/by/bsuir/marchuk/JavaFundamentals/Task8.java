package by.bsuir.marchuk.JavaFundamentals;

import java.util.Scanner;

public class Task8 {
    public static int countA, countB;
    public static double[] a, b;
    public static void shift(double[] arr, int start){
        //сдвиг всего массива

    }
    public static void task8(double[] arrA, double[] arrB)
    {
        int posA = 0, posB = 0, index = 0;

        while (posA < arrA.length) {
            if (arrB[posB] < arrA[posA]) {
                System.out.print(index);
                System.out.print(" ");
                posB++;
            }
            else {
                posA++;
                index++;
            }

        }
        while (posB != arrB.length) {
            System.out.print(index);
            System.out.print(" ");
            posB++;
        }
    }
    public static boolean increasingCheck(double[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]){
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void outputArray(double[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.format("%.2f  ", array[j]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Entry count of a: ");
            countA = in.nextInt();
            a = new double[countA];
            for (int j = 0; j < countA; j++) {
                System.out.format("a[%d] = ", j);
                a[j] = in.nextDouble();
            }

            System.out.println("Entry count of b: ");
            countB = in.nextInt();
            b = new double[countB];
            for (int j = 0; j < countB; j++) {
                System.out.format("b[%d] = ", j);
                b[j] = in.nextDouble();
            }

            if ((increasingCheck(a) == true) && (increasingCheck(b) == true)){
                task8(a, b);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
