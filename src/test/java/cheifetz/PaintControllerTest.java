package cheifetz;

import cheifetz.paint.PaintCanvas;
import cheifetz.paint.PaintController;
import javafx.event.ActionEvent;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class PaintControllerTest {


    private PaintController controller;
    private ColorPicker colorpicker;
    private Slider slider;
    private PaintCanvas paintcanvas;

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(() -> {
        });
    }

    @Test
    public void initialize() {
//        // given
//        givenPaintController();
//        doReturn();
//        // when
//        controller.initialize();
    }

    @Test
    public void changeColor() {
        // given
        givenPaintController();
        // when
      //  controller.getColo(mock(ActionEvent.class));
        // then
        //verify();
    }

    @Test
    public void clear() {
        // given
        givenPaintController();
        // when
        //controller.clear(mock(ActionEvent.class));
        // then
        //verify();
    }

    private void givenPaintController() {
//        paintcanvas = mock(PaintCanvas.class);
//        colorpicker = mock(ColorPicker.class);
//        slider = mock(Slider.class);
//        controller = new PaintController(paintcanvas, colorpicker, slider);
//
    }

}
