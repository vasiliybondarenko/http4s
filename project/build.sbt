scalacOptions := Seq(
  "-deprecation"
)

// For MimeLoader plugin. Dogfooding and hoping it doesn't clash with
// our other sbt plugins.
libraryDependencies ++= List(
  "com.eed3si9n" %% "treehugger" % "0.4.4",
  "io.circe" %% "circe-generic" % "0.14.1",
  "org.http4s" %% "http4s-blaze-client" % "0.21.24",
  "org.http4s" %% "http4s-circe" % "0.21.24",
)
