organization in Global := "com.quadas"
name in Global := "rapidstring"
scalaVersion in Global := "2.11.8"
crossScalaVersions in Global := Seq("2.11.8", "2.12.1")

version := "0.1.3.1"

scalacOptions := Seq(
  "-deprecation"             // Emit warning and location for usages of deprecated APIs
  , "-encoding", "UTF-8"
  , "-feature"                 // Emit warning and location for usages of features that should be imported explicitly
  , "-unchecked"               // Enable additional warnings where generated code depends on assumptions
  , "-Xfatal-warnings"         // Fail the compilation if there are any warnings
  , "-Xfuture"                 // Turn on future language features
  , "-Xlint"                   // Enable specific warnings (see `scalac -Xlint:help`)
  , "-Yno-adapted-args"        // Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver
  , "-Ywarn-dead-code"         // Warn when dead code is identified
  , "-Ywarn-inaccessible"      // Warn about inaccessible types in method signatures
  , "-Ywarn-infer-any"         // Warn when a type argument is inferred to be `Any`
  , "-Ywarn-nullary-override"  // Warn when non-nullary `def f()' overrides nullary `def f'
  , "-Ywarn-nullary-unit"      // Warn when nullary methods return Unit
  , "-Ywarn-numeric-widen"     // Warn when numerics are widened
  , "-Ywarn-unused"            // Warn when local and private vals, vars, defs, and types are unused
  , "-Ywarn-unused-import"     // Warn when imports are unused
  , "-Ywarn-value-discard"     // Warn when non-Unit expression results are unused
)
scalacOptions ++= Seq("-Xelide-below", "FINEST")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies <+= scalaVersion { sv =>
  "org.scala-lang" % "scala-reflect" % sv
}

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
bintrayRepository := "maven"
bintrayOrganization := Some("quadas")
bintrayReleaseOnPublish := false
homepage := Some(url("https://github.com/quadas/rapidstring"))

scmInfo := Some(ScmInfo(
  url("https://github.com/quadas/rapidstring"),
  "scm:git:git://github.com/quadas/rapidstring.git",
  Some("scm:git:git@github.com:quadas/rapidstring.git")))

pomExtra :=
  <developers>
    <developer>
      <id>quadas</id>
      <name>quadas</name>
      <timezone>+8</timezone>
      <email>dev@quadas.com</email>
    </developer>
  </developers>
