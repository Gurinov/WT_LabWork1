package by.bsuir.gurinov.task9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public final class Basket {

    private LinkedList<Ball> balls;

    public Basket() {
        balls = new LinkedList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public Ball popBall() {
        return balls.pollLast();
    }

    public void emptyBasket() {
        balls.clear();
    }

    public boolean isEmpty() {
        return getBallsCount() == 0;
    }

    public int getBallsCount() {
        return balls.size();
    }

    public ArrayList<Ball> getBalls() {
        return new ArrayList<>(balls);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        return Objects.equals(balls, ((Basket) o).balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@balls: " + balls.toString();
    }

    public double getBallsWeight(){
        double weight = 0;
        for( Ball ball : balls){
            weight += ball.getWeight();
        }
        return weight;
    }
    public int getBlueBallsCount(){
        int count = 0;
        for( Ball ball : balls){
            if(ball.getColor().equals("blue")){
                count++;
            }
        }
        return count;
    }
}