package cheifetz.paint;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;


public class PaintController {

    @FXML
    private PaintCanvas paintCanvas;
    @FXML
    private ColorPicker colorpicker;
    @FXML
    ToggleButton eraser;


    public void initialize() {
        paintCanvas = new PaintCanvas();

       // eraser.setOnMousePressed(e -> paintCanvas.eraserOn(eraser.isSelected()));

        paintCanvas.setOnMousePressed(e -> paintCanvas.onPressed(e.getX(), e.getY(), colorpicker.getValue()));

        paintCanvas.setOnMouseDragged(e -> paintCanvas.onDragged(e.getX(), e.getY()));

        paintCanvas.setOnMouseReleased(e -> paintCanvas.onReleased());

        colorpicker.setOnAction(e -> paintCanvas.setColor(colorpicker.getValue()));

    }

}
