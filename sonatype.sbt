import sbt.url
import xerial.sbt.Sonatype.GitHubHosting

sonatypeProfileName in ThisBuild := "ky.korins"
publishMavenStyle in ThisBuild := true
sonatypeProjectHosting in ThisBuild := Some(
  GitHubHosting("catap", "scala-sha", "kirill@korins.ky")
)
licenses in ThisBuild := LicenseDefinition.licenses
homepage in ThisBuild := Some(url("https://github.com/catap/scala-sha"))
scmInfo in ThisBuild := Some(
  ScmInfo(
    url("https://github.com/catap/scala-sha"),
    "scm:git@github.com:catap/scala-sha.git"
  )
)
developers in ThisBuild := List(
  Developer(
    id = "catap",
    name = "Kirill A. Korinsky",
    email = "kirill@korins.ky",
    url = url("https://github.com/catap")
  )
)
