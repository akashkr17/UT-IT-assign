import Dependencies.{Libraries, testDependencies}
import CommonSettings._
name := "UT-IT"

version := "0.1"

scalaVersion := "2.13.4"


lazy val root = (project in file("."))
  .aggregate(scalaAssignment)
  .settings(
    name := "root",
    libraryDependencies ++= testDependencies
  )
lazy val scalaAssignment = (
  baseProject("ScalaAssignment")
    settings(libraryDependencies ++= testDependencies)
  )