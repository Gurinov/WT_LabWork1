package by.bsuir.gurinov.task9;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    Basket basket = new Basket();

    @Test
    void getBallsWeight() {
        basket.addBall(new Ball(1,"red"));
        basket.addBall(new Ball(2,"green"));
        basket.addBall(new Ball(1,"blue"));
        basket.addBall(new Ball(3,"blue"));
        basket.addBall(new Ball(1,"black"));
        assertEquals(basket.getBallsWeight(),8);
    }

    @Test
    void getBlueBallsCount() {
        basket.addBall(new Ball(1,"red"));
        basket.addBall(new Ball(2,"green"));
        basket.addBall(new Ball(1,"blue"));
        basket.addBall(new Ball(3,"blue"));
        basket.addBall(new Ball(1,"black"));
        assertEquals(basket.getBlueBallsCount(),2);
    }
}