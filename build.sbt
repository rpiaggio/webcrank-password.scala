name := "webcrank-password"

organization := "io.webcrank"

scalaVersion := "2.12.0"

crossScalaVersions := Seq("2.11.0", "2.12.0")

scalacOptions ++= Seq("-Xlint", "-Ywarn-adapted-args", "-Ywarn-dead-code", "-Ywarn-inaccessible", "-Ywarn-infer-any",
  "-Ywarn-nullary-override", "-Ywarn-nullary-unit", "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard")

libraryDependencies ++= Seq(
  "de.svenkubiak" % "jBCrypt" % "0.4.1",
  "com.lambdaworks" % "scrypt" % "1.4.0",
  "com.owtelse.codec" % "base64" % "1.0.6",
  "org.scalaz" %% "scalaz-scalacheck-binding" % "7.2.8" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.specs2" %% "specs2-core" % "3.8.8" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

publishTo := Some(Resolver.file("file", new File("../maven-repo")))
