name := "webcrank-password"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "de.svenkubiak" % "jBCrypt" % "0.4.1",
  "com.lambdaworks" % "scrypt" % "1.4.0",
  "com.owtelse.codec" % "base64" % "1.0.6",
  "org.scalaz" %% "scalaz-scalacheck-binding" % "7.0.8" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test",
  "org.specs2" %% "specs2" % "2.3.13" % "test"
)

publishTo := Some(Resolver.file("file",  new File( "../maven-repo" )) )
