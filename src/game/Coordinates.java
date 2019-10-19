package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.concurrent.ThreadLocalRandom;

public class Coordinates {
    public static int SIZE = 10;
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinates random(int width, int height) {
        int maxX = width / Coordinates.SIZE;
        int maxY = height / Coordinates.SIZE;
        int x = ThreadLocalRandom.current().nextInt(maxX);
        int y = ThreadLocalRandom.current().nextInt(maxY);
        return new Coordinates(x,y);
    }

    public int getPixelX() {
        return  x * SIZE;
    }

    public int getPixelY() {
        return  y * SIZE;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
