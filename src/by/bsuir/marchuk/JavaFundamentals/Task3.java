package by.bsuir.marchuk.JavaFundamentals;

import java.util.Scanner;

public class Task3 {
    public static double x;
    public static double a;
    public static double b;
    public static double h;
    public static void funcTg(double a, double b, double h){
        double y;
        double x;

        System.out.format(" %-10s%-10s \n", "-----------", "-----------");
        System.out.format("|%-10s||%-10s|\n", "x", "y");
        System.out.format("|%-10s%-10s|\n", "-----------", "-----------");
        x = a;
        while (x <= b){
            y = Math.tan(x);
            System.out.format("|%-10f||%-10f|\n", x, y);
            x = x + h;
        }
        System.out.format(" %-10s%-10s \n", "-----------", "-----------");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Entry A:");
            a = in.nextDouble();
            System.out.println("Entry B:");
            b = in.nextDouble();
            System.out.println("Entry H:");
            h = in.nextDouble();

            funcTg(a, b, h);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
