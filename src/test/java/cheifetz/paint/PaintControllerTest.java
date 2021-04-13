package cheifetz.paint;

import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class PaintControllerTest {

    private PaintController controller;

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(() -> {
        });
    }

    @Test
    public void initialize() {
        // given
        givenPaintController();
        doNothing().when(controller.colorPicker).setValue(Color.BLACK);
        // when
        controller.initialize();
        //then
        verify(controller.colorPicker).setValue(Color.BLACK);
    }

    private void givenPaintController() {
        controller = new PaintController();
        controller.paintCanvas = mock(PaintCanvas.class);
        controller.slider = mock(Slider.class);
        controller.paintCanvas = mock(PaintCanvas.class);
        controller.colorPicker = mock(ColorPicker.class);
        DoubleProperty doubleProperty = mock(DoubleProperty.class);
        doReturn(doubleProperty).when(controller.slider).valueProperty();
    }

    @Test
    public void changeColor() {
        // given
        givenPaintController();
        doReturn(Color.AQUA).when(controller.colorPicker).getValue();
        // when
        controller.changeColor(mock(ActionEvent.class));
        // then
        verify(controller.paintCanvas).setColor(Color.AQUA);
    }

    @Test
    public void clear() {
        givenPaintController();
        // when
        controller.clear();
        // then
        verify(controller.paintCanvas).clear();
    }

}
