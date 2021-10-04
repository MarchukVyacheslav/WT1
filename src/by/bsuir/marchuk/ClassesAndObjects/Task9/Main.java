package by.bsuir.marchuk.ClassesAndObjects.Task9;

import java.util.ArrayList;
import java.util.Arrays;
import  by.bsuir.marchuk.ClassesAndObjects.Task9.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.BLACK, 0.3),
                new Ball(Color.RED, 0.1),
                new Ball(Color.BLUE, 0.2)
        ));

        Basket basket = new Basket(balls);
        System.out.println("Balls inside the basket: ");
        for (Ball ball: basket.balls) {
            System.out.println("Color: " + ball.color  + " weight: " + ball.weight);
        }
    }
}
