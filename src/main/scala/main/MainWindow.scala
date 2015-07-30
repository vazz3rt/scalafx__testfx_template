package main

import scalafx.application.JFXApp.PrimaryStage
import scalafx.application.{JFXApp, _}
import scalafx.event.ActionEvent
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.Includes._


object MainWindow extends JFXApp {

  def getMainSceneContent = {
    new HBox {
      padding = Insets(20)
      val testBtn = new Button("Hello") {
        onAction = { e: ActionEvent =>
          text = "World"
        }
        id = "testButton"
      }
      content = testBtn
    }
  }

  stage = new PrimaryStage {
    title = "ScalaFX Hello World"
    scene = new Scene {
      fill = Black
      content = getMainSceneContent
    }
  }

}
