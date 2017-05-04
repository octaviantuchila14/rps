 name := "rps"

version := "1.0"

scalaVersion := "2.12.2"


libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// https://mvnrepository.com/artifact/org.mockito/mockito-core
libraryDependencies += "org.mockito" % "mockito-core" % "1.8.5"

mainClass in (Compile, run) := Some("rps.Game")
mainClass in (Compile, packageBin) := Some("rps.Game")


