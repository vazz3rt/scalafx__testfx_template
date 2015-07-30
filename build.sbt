name := "Tank"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "8.0.20-R6",
  "org.testfx" % "testfx-core" % "4.0.1-alpha",
  "org.testfx" % "testfx-junit" % "4.0.1-alpha",
  "org.specs2" % "specs2-core_2.11" % "3.0-M3",
  "org.specs2" % "specs2-matcher_2.11" % "3.0-M3",
  "org.specs2" % "specs2-junit_2.11" % "3.0-M3")

fork := true