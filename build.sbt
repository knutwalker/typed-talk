scalaVersion := "2.11.7"
name := "typed-talk"


libraryDependencies ++= List(
  "com.typesafe.akka" %% "akka-actor"              % "2.4.1",
  "com.typesafe.akka" %% "akka-typed-experimental" % "2.4.1",
  "de.knutwalker"     %% "typed-actors"            % "1.5.1-a24",
  "de.knutwalker"     %% "typed-actors-creator"    % "1.5.1-a24"
)


scalacOptions ++= List(
  "-Xfatal-warnings", "-feature", "-deprecation", "-unchecked", "-Xlint:_",
  "-encoding", "UTF-8", "-language:_", "-target:jvm-1.8", "-Yno-adapted-args"
)
fork in run := true
connectInput in run := true
libraryDependencies += "com.lihaoyi" % "ammonite-repl" % "0.5.0" % "test" cross CrossVersion.full
initialCommands in (Test, console) := """ammonite.repl.Repl.run("")"""
