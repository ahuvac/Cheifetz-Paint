package cheifetz.paint;


import javafx.event.ActionEvent;
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

    }

    public void changeColor(ActionEvent actionEvent) {
        paintCanvas.setColor(colorpicker.getValue());

    }

    public void erase(ActionEvent actionEvent) {
        if(eraser.isSelected()) {
            paintCanvas.eraserOn();
        }
    }
}
