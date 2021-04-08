package cheifetz.paint;


import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintCanvas extends Canvas {
    private final GraphicsContext context = getGraphicsContext2D();
    private boolean draw = true;
    private Color lineColor;


    public PaintCanvas() {


        addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
            if (!draw) {
                double lineWidth = context.getLineWidth();
                context.clearRect(e.getX() - lineWidth / 2, e.getY() - lineWidth / 2, lineWidth, lineWidth);
            }
            context.setStroke(lineColor);
            context.setLineWidth(3);
            context.beginPath();
            context.lineTo(e.getX(), e.getY());
        });
        addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
            if (!draw) {
                double lineWidth = context.getLineWidth();
                context.clearRect(e.getX() - lineWidth / 2, e.getY() - lineWidth / 2, lineWidth, lineWidth);
            }
            context.setStroke(lineColor);
            context.setLineWidth(3);
            context.lineTo(e.getX(), e.getY());
            context.stroke();
        });

        addEventHandler(MouseEvent.MOUSE_RELEASED, e -> {
            context.lineTo(e.getX(), e.getY());
            context.stroke();
            context.closePath();
        });

    }


    public void setColor(Color color) {
        this.lineColor = color;
        context.setLineWidth(3);
    }

    public void eraserOn() {
            this.lineColor = Color.WHITE;

    }
}




