package by.bsuir.marchuk.JavaFundamentals;

import java.util.Scanner;

public class Task1 {
    public static double x;
    public static double y;
    public static double resultValue;
    public static double Square(double x){
        return x * x;
    }
    public static double Value(double x, double y){
        double res = 0,
               numerator = 0,
               denominator = 0;

        numerator = 1 + Square(Math.sin(x + y));
        denominator = 2 + Math.abs(x - 2*x / 1 + Square(x)*Square(y));
        res = (numerator / denominator) + x;
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Entry X:");
            x = in.nextDouble();
            System.out.println("Entry Y:");
            y = in.nextDouble();
            resultValue = Value(x, y);
            System.out.format("Result value: %f", resultValue);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
