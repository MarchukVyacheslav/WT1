package by.bsuir.marchuk.ClassesAndObjects.Task9;

import by.bsuir.marchuk.ClassesAndObjects.Task9.Basket;
import by.bsuir.marchuk.ClassesAndObjects.Task9.Color;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Ball> balls;
    public double weight;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls)
    {
        if (balls == null)
            throw new NullPointerException();

        this.balls = new ArrayList<>();
        for (Ball ball: balls)
            add(ball);
    }

    public void add(Ball newBall)
    {
        if (newBall == null)
            throw new NullPointerException();

        this.balls.add(newBall);
        this.weight += newBall.weight;
    }

    public void remove(Ball ball){
        balls.remove(ball);
        this.weight -= ball.weight;
    }

    public int getColorCount(Color color)
    {
        int numOfBalls = 0;
        for (Ball  ball: balls)
        {
            if (ball.color == color)
                numOfBalls++;
        }

        return numOfBalls;
    }
}
