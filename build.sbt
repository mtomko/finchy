import sbt._

/* scala versions and options */
scalaVersion in ThisBuild := "2.12.4"

val FinchVersion = "0.16.0"

lazy val finchy =
  project
    .in(file("."))
    .settings(
      name := "Scala Finch Project",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.12.4",
      libraryDependencies ++= Seq("com.github.finagle" %% "finch-core" % FinchVersion)
    )

