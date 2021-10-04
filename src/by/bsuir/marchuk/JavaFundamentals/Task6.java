package by.bsuir.marchuk.JavaFundamentals;

import java.util.Scanner;

public class Task6 {
    public static int countElArr;
    public static double[] array;
    public static double[][] matrix;
    public static void outputMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.format("%.2f  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void outputArray(double[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.format("%.2f  ", array[j]);
        }
    }
    public static void task6(double[] array, double[][] matrix){
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                matrix[i][j] = array[(j + i) % array.length]; //shift left
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Entry count of array: ");
            countElArr = in.nextInt();
            array = new double[countElArr];
            matrix = new double[countElArr][countElArr];

            for (int j = 0; j < countElArr; j++) {
                System.out.format("Array[%d] = ", j);
                array[j] = in.nextDouble();
            }

            task6(array, matrix);
            System.out.println("Array: ");
            outputArray(array);
            System.out.println();
            System.out.println("Matrix: ");
            outputMatrix(matrix);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
