package by.bsuir.marchuk.JavaFundamentals;

import java.util.Scanner;

public class Task2 {
    public static double x;
    public static double y;
    public static boolean IsPlace(double x, double y){
        if ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)){
            return true;
        }
        if ((x >= -6 && x <= 6) && (y >= -3 && y <= 0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Entry X:");
            x = in.nextDouble();
            System.out.println("Entry Y:");
            y = in.nextDouble();
            if (IsPlace(x, y) == true){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
