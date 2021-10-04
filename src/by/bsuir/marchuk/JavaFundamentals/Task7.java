package by.bsuir.marchuk.JavaFundamentals;

import java.util.Scanner;

public class Task7 {
    public static int countElArr;
    public static double[] array;
    public static void outputArray(double[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.format("%.2f  ", array[j]);
        }
    }
    public static void sort(double[] array){
        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i+1]){
                double temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if(i > 0)
                    i--;
            }
            else {
                i++;
            }
        }
    }
    public static void task7(double[] array){
        sort(array);
        outputArray(array);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Entry count of array: ");
            countElArr = in.nextInt();
            array = new double[countElArr];

            for (int j = 0; j < countElArr; j++) {
                System.out.format("Array[%d] = ", j);
                array[j] = in.nextDouble();
            }

            task7(array);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
