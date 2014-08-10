name := "NAME"

scalaVersion := "2.11.2"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xlint",
  "-Xfuture",
  // "-Xfatal-warnings"
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
  // "-Yno-predef"
  // "-Yno-imports"
)

// project dependencies
libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-async" % "0.9.2",
  "org.scalaz"             %% "scalaz-core" % "7.1.0",
  "com.chuusai"            %% "shapeless"   % "2.0.0"
)

// testing dependencies
libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "2.2.1"  % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)
