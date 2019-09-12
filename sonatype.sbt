PgpKeys.useGpg in Global := true

PgpKeys.gpgCommand in Global := "gpg2"

PgpKeys.useGpgAgent in Global := true

publishTo in ThisBuild := sonatypePublishTo.value

publishMavenStyle in ThisBuild := true

sonatypeProfileName := "dk.cwconsult"

licenses in ThisBuild := Seq(
  "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html")
)

homepage in ThisBuild := Some(
  url("https://github.com/ClockworkConsulting/scalastyle-sbt-plugin")
)

scmInfo in ThisBuild := Some(
  ScmInfo(
    url("https://github.com/ClockworkConsulting/scalastyle-sbt-plugin"),
    "git@github.com:ClockworkConsulting/scalastyle-sbt-plugin.git"
  )
)

developers in ThisBuild := List(
  Developer(
    id = "BardurArantsson",
    name = "Bardur Arantsson",
    email = "ba@cwconsult.dk",
    url = url("https://www.cwconsult.dk")
  ),
  Developer(
    id = "matthewfarwell",
    name = "Matthew Farwell",
    email = "matthew@farwell.co.uk",
    url = url("http://www.farwell.co.uk")
  )
)
