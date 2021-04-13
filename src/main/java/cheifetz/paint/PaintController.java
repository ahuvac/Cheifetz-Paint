package cheifetz.paint;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class PaintController {

    @FXML
    PaintCanvas paintCanvas;
    @FXML
    ColorPicker colorPicker;
    @FXML
    Slider slider;

    public void initialize() {
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            paintCanvas.setLineWidth(newValue.doubleValue());
        });
        colorPicker.setValue(Color.BLACK);
    }

    public void changeColor(ActionEvent actionEvent) {
        paintCanvas.setColor(colorPicker.getValue());
    }

    public void clear(){
        paintCanvas.clear();
    }

}
