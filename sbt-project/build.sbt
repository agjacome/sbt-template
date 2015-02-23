name         := "NAME"
organization := "com.example"
scalaVersion := "2.11.5"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  // "-language:postfixOps",
  "-unchecked",
  // "-Xfatal-warnings",
  "-Xfuture",
  "-Xlint",
  "-Yno-adapted-args",
  // "-Yno-imports",
  // "-Yno-predef",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import"
)

libraryDependencies ++= Seq(
  // core dependencies
  "org.scalaz"                 %% "scalaz-core"      % "7.1.1",
  "org.scalaz"                 %% "scalaz-effect"    % "7.1.1",
  "com.chuusai"                %% "shapeless"        % "2.0.0",
  "org.typelevel"              %% "shapeless-scalaz" % "0.3"  ,
  "com.github.julien-truffaut" %% "monocle-core"     % "1.0.1",
  "com.github.julien-truffaut" %% "monocle-generic"  % "1.0.1",

  // testing dependencies
  "org.scalatest"              %% "scalatest"            % "2.2.4"  % "test",
  "org.scalacheck"             %% "scalacheck"           % "1.12.2" % "test",
  "org.typelevel"              %% "shapeless-scalacheck" % "0.3"    % "test",
  "com.github.julien-truffaut" %% "monocle-law"          % "1.0.1"  % "test"
)

shellPrompt := { state => name.value + " » " }
