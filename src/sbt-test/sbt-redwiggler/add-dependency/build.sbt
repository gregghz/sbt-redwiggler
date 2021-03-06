lazy val root = (project in file("."))
  .enablePlugins(SbtRedWiggler)
  .settings(
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.8",
    libraryDependencies += SbtRedWiggler.redwigglerDependency("restassured")
  )
