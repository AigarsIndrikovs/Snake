package game;

import javafx.event.ActionEvent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import game.Snake;

import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private Food apple;
    public Game() {
        Log.On();
    }

    /**
     * Width of the field
     *
     * @return width in pixels
     */
    public static int getWidth() {
        return 1000;
    }

    /**
     * Height of the field
     *
     * @return height in pixels
     */
    public static int getHeight() {
        return 600;
    }

    /**
     * This is called when Start button is pressed
     *
     * @param event
     */
    public void start(ActionEvent event) {
        Log.debug();
        Coordinates p = Coordinates.random(getWidth(), getHeight());
        apple = new Apple(p);

    }

    /**
     * This is called when pause buttons is pressed
     *
     * @param event
     */
    public void pause(ActionEvent event) {
        Log.debug();
    }

    /**
     * This is called when mouse button is pressed on a Canvas
     *
     * @param mouseEvent
     */
    public void mousePressed(MouseEvent mouseEvent) {
        Log.debug("Pressed at " + mouseEvent.getX() + ':' + mouseEvent.getY());
        switch (mouseEvent.getButton()){
            case PRIMARY:

            case SECONDARY:

        }
    }

    /**
     * This is called when mouse button is released on a Canvas
     *
     * @param mouseEvent
     */
    public void mouseReleased(MouseEvent mouseEvent) {
        Log.debug("Released at " + mouseEvent.getX() + ':' + mouseEvent.getY());
    }

    /**
     * This is called every time images is renewed on the Canvas.
     *
     * @param graphicsContext - use this to draw something
     * @param now             - use this to measure how much time has passed from previous frame drawing (if needed)
     */
    public void onRedraw(GraphicsContext graphicsContext, Long now) {
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(0, 0, getWidth(), getHeight());
        if (apple != null) {
            apple.draw(graphicsContext);
        }
    }
}
