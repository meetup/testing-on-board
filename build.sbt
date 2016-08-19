lazy val root = (project in file(".")).
  settings(
    name := "testing-on-board",
    version := "1.0",
    scalaVersion := "2.11.7"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test",
  "org.mockito" % "mockito-core" % "1.10.19"  % "test",
  "org.scala-lang.modules" % "scala-java8-compat_2.11" % "0.7.0" % "test"
)
