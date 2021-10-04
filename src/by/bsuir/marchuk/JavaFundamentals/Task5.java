package by.bsuir.marchuk.JavaFundamentals;

import java.util.Scanner;

public class Task5 {
    public static int countElArr;
    public static int[] array;
    public static void task5(int[] array){
        int i, k, m;
        m = array[0];
        for (i = 1, k = 0; i < countElArr; i++){
            if (m >= array[i]){
                k = k + 1;
                System.out.println("It is necessary to remove such elements:");
                System.out.format("Array[%d] = %d\n", i, array[i]);
            }
            if (m < array[i]){
                m = array[i];
            }
        }
        System.out.format("Smallest number of K elements = %d", k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Entry count of array: ");
            countElArr = in.nextInt();
            array = new int[countElArr];

            for (int j = 0; j < countElArr; j++) {
                System.out.format("Array[%d] = ", j);
                array[j] = in.nextInt();
            }

            task5(array);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
