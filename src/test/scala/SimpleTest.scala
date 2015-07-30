
import org.junit.{Test}
import javafx.scene.control.Button
import org.specs2.matcher.JUnitMustMatchers
import org.testfx.api.FxAssert._
import org.testfx.matcher.base.NodeMatchers._

class SimpleTest extends InitialSetup with JUnitMustMatchers{


  @Test
  def lookupByNodeText: Unit = {
    val b: Button = lookup("Hello").queryFirst()
    clickOn(b)
    b.getText must beEqualTo("World")
  }

  @Test
  def lookupByID: Unit = {
    val b: Button = lookup("#testButton").queryFirst()
    clickOn(b)
    b.getText must beEqualTo("World")
  }

  @Test
  def builtInMatchersExample = {
    verifyThat("#testButton", hasText("Hello"))
    clickOn("#testButton")
    verifyThat("#testButton", hasText("World"))
  }
}
