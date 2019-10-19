package game;

import javafx.scene.paint.Color;

public class Apple extends Food {
    private static int SCORE_INCREMENT = 10;
    private static int SNAKE_INCREMENT = 1;
    private static final Color color = Color.RED;

    public Apple(Coordinates point) {
        super(point, SCORE_INCREMENT, SNAKE_INCREMENT, color);


    }
}
