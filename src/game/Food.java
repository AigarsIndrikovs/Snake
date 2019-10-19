package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Food implements Drawable{
    private Coordinates point;
    private int score;
    private int snakeIncrement;
    private Color color;

    public Food(Coordinates point, int score, int snakeIncrement, Color color) {
        this.point = point;
        this.score = score;
        this.snakeIncrement = snakeIncrement;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillRect(point.getPixelX(),point.getPixelY(), Coordinates.SIZE, Coordinates.SIZE);
    }
}
