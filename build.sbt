val commonSettings = Seq(
  name := "circe-scalajs-example",
  scalaVersion := "2.12.3"
)

val circeVersion = "0.8.0"

lazy val simple = (project in file("simple"))
  .settings(libraryDependencies ++= Seq(
    "io.circe" %%% "circe-core",
    "io.circe" %%% "circe-generic",
    "io.circe" %%% "circe-parser"
  ).map(_ % circeVersion))
  .enablePlugins(ScalaJSPlugin)
  .settings(scalaJSUseMainModuleInitializer := true)

lazy val shared = crossProject.in(file("."))
  .settings(libraryDependencies ++= Seq(
    "io.circe" %%% "circe-core",
    "io.circe" %%% "circe-generic",
    "io.circe" %%% "circe-parser"
  ).map(_ % circeVersion))
  .jvmSettings()
  .jsSettings(scalaJSUseMainModuleInitializer := true)

lazy val sharedJVM = shared.jvm
lazy val sharedJS = shared.js

lazy val rootProject = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(simple, sharedJVM, sharedJS)
