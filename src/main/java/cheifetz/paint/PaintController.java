package cheifetz.paint;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
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
    private Slider slider;

//    public PaintController(ColorPicker colorpicker) {
//
//    }

    public void initialize() {
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                paintCanvas.setLineWidth(new_val.doubleValue());
            }
        });
        colorpicker.setValue(Color.BLACK);
    }

    public void changeColor(ActionEvent actionEvent) {
        paintCanvas.setColor(colorpicker.getValue());
    }

    public void clear(){
        paintCanvas.clear();
    }

}
