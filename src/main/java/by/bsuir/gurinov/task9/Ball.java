package by.bsuir.gurinov.task9;

import java.util.Objects;

public final class Ball {

    private final double weight;
    private final String color;
    public double getWeight() {
        return weight;
    }
    String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        Ball ball;

        if (this == o) {
            return true;
        }
        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        ball = (Ball) o;
        return (ball.weight == weight) && Objects.equals(ball.color, color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }

    @Override
    public String toString() {
        return getClass().getName() + "weight: " + weight + ", color: " + color;
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}