import main.MainWindow;
import org.junit.Before;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.util.WaitForAsyncUtils;


public class InitialSetup extends FxRobot {
    @Before
    public void internalSetup() throws Exception {
        target(FxToolkit.registerPrimaryStage());
        FxToolkit.setupSceneRoot(() -> MainWindow.getMainSceneContent().delegate());

        WaitForAsyncUtils.waitForFxEvents();

        FxToolkit.setupStage((stage) -> {
            stage.setWidth(1200);
            stage.setHeight(900);
            stage.show();
            stage.toBack();
            stage.toFront();
        });
        WaitForAsyncUtils.waitForFxEvents();
    }
}
