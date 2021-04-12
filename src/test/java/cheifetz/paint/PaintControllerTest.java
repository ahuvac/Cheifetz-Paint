package cheifetz.paint;

import javafx.event.ActionEvent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class PaintControllerTest {

    private PaintController controller;
    private ColorPicker colorpicker;
    private Slider slider;
    private PaintCanvas paintcanvas;
    private GraphicsContext context;

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
        controller.slider = mock(Slider.class);

        // when
        controller.initialize();

        //then
        verify(colorpicker).setValue(Color.BLACK);



    }

    private void givenPaintController() {
        controller = new PaintController();
        controller.paintCanvas = mock(PaintCanvas.class);
        controller.colorPicker = mock(ColorPicker.class);
    }

//    @Test
//    public void changeColor() {
//        // given
//        givenPaintController();
//        ActionEvent event = mock(ActionEvent.class);
//        doNothing().when(controller.colorPicker).setValue(Color.AQUA);
//        // when
//        controller.changeColor(event);
//        // then
//        verify(paintcanvas).setColor(Color.AQUA);
//    }

//    @Test
//    public void clear() {
//        givenPaintController();
//        // when
//        controller.clear();
//        // then
//        verify(paintcanvas).clear();
//    }

}
