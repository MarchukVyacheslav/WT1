package by.bsuir.marchuk.JavaFundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static int countElArr;
    public static int[] array;
    public static void task4(int[] array){
        int i;

        System.out.println("Simple dig of array are: ");
        for (i = 0; i < countElArr; i++){
            if (isSimple(array[i]) == true)
                System.out.format("Array[%d] = %d\n", i, array[i]);
        }
    }
    public static boolean isSimple(int a){
        int i;

        for (i = 2; i <= Math.sqrt(a); i++){
            if ((a % i) == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Entry count of array: ");
            countElArr = in.nextInt();
            array = new int[countElArr];

            for (int j = 0; j < countElArr; j++){
                System.out.format("Array[%d] = ", j);
                array[j] = in.nextInt();
            }

            task4(array);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
