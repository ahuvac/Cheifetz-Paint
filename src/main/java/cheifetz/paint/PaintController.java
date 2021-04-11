package cheifetz.paint;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;


public class PaintController {

    @FXML
    private PaintCanvas paintCanvas;
    @FXML
    private ColorPicker colorPicker
            ;
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
        colorPicker.setValue(Color.BLACK);
    }

    public void changeColor(ActionEvent actionEvent) {
        paintCanvas.setColor(colorPicker.getValue());
    }

    public void clear(){
        paintCanvas.clear();
    }

}
