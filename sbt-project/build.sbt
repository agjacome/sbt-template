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
  // "-Xfatal-warnings",
  "-Xfuture",
  "-Xlint",
  "-Yno-adapted-args",
  // "-Yno-imports",
  // "-Yno-predef",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)

// project dependencies
libraryDependencies ++= Seq(
  "org.scalaz"                 %% "scalaz-core"  % "7.1.0",
  "com.chuusai"                %% "shapeless"    % "2.0.0",
  "com.github.julien-truffaut" %% "monocle-core" % "0.5.0"
)

// testing dependencies
libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "2.2.1"  % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)

shellPrompt := { state => Project.extract(state).currentRef.project + " > " }
