ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "dfexp"
  )

libraryDependencies+="org.apache.spark"%%"spark-core"%"3.2.0"
libraryDependencies+="org.apache.spark"%%"spark-sql"%"3.2.0"