val commonSettings = Seq(
  name := "circe-scalajs-example",
  scalaVersion := "2.12.3"
)

val circeVersion = "0.8.0"
lazy val rootProject = (project in file("."))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= Seq(
    "io.circe" %%% "circe-core",
    "io.circe" %%% "circe-generic",
    "io.circe" %%% "circe-parser"
  ).map(_ % circeVersion))
  .enablePlugins(ScalaJSPlugin)
  .settings(scalaJSUseMainModuleInitializer := true)
