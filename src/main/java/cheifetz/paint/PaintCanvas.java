package cheifetz.paint;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class PaintCanvas extends Canvas {
    private final GraphicsContext context = getGraphicsContext2D();
    private double lineWidth = 3;
    private Color color;

    public PaintCanvas() {
        addEventHandler(MouseEvent.MOUSE_PRESSED, this::draw);
        addEventHandler(MouseEvent.MOUSE_DRAGGED, this::draw);
        addEventHandler(MouseEvent.MOUSE_RELEASED, this::draw);
    }

    public void draw(MouseEvent e) {
        if (e.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
            context.beginPath();
        }
        context.setLineWidth(lineWidth);
        context.lineTo(e.getX(), e.getY());
        context.stroke();
        if (e.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
            context.closePath();
        }
    }

    public void setColor(Color color) {
        this.color = color;
        context.setStroke(this.color);
    }

    public void setLineWidth(double value) {
        lineWidth = value;
    }

    public void clear() { context.clearRect(0, 0, 350, 300);}

    public Object getColor() {
        return this.color;
    }
}




