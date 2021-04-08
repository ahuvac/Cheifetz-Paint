package cheifetz.paint;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintCanvas extends Canvas {
    private GraphicsContext context;
    private boolean draw = true;

    public PaintCanvas() {
        Canvas canvas = new Canvas();
        context = canvas.getGraphicsContext2D();
    }

    public void onPressed(double x, double y, Color color) {
        if(!draw) {
            context.setStroke(Color.WHITESMOKE);
        }

            context.setStroke(color);
            context.beginPath();
            context.lineTo(x, y);

    }

    public void onDragged(double x, double y) {
        if(!draw) {
            context.setStroke(Color.WHITESMOKE);
        }
            context.lineTo(x, y);
            context.stroke();
    }
    public void onReleased() {
        if(!draw) {
            context.setStroke(Color.WHITESMOKE);
        }
            context.stroke();
            context.closePath();
    }


    public void setColor(Color color) {
        context.setStroke(color);
    }

    public void eraserOn(boolean on) {
         if(on) draw = false;
    }
}




