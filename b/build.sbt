import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "b",
    libraryDependencies += scalaTest % Test,
    // libraryDependencies += "com.example" %% "a" % "0.1.0-SNAPSHOT",
    unmanagedClasspath in Compile ++= Seq(
      file("../a/target/scala-2.12/a-assembly-0.1.0-SNAPSHOT.jar"),
    )
  )
