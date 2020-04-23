import sbt.Keys.mainClass

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-native-packager-ashscriptplugin-bug",
    mainClass := Some("example.Hello"),
    dockerBaseImage := "openjdk:11-jre"
  )
  .enablePlugins(AshScriptPlugin, DockerPlugin)
