enablePlugins(SbtPlugin)

scalacOptions := Seq("-deprecation", "-unchecked")

organization := "dk.cwconsult.scalastyle"

name := "scalastyle-sbt-plugin"

libraryDependencies ++= Seq(
  "dk.cwconsult.scalastyle" %% "scalastyle" % "1.1.0"
)

publishArtifact in Test := false
