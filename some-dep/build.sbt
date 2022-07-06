inThisBuild(
  List(
    name           := "some-dep",
    normalizedName := "some-dep",
    organization   := "io.github.anonymous-hero",
    scalaVersion   := "2.13.8",
    licenses       := List("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0")),
    developers := List(
      Developer(
        "anonymous-hero",
        "Anonymous Hero",
        "anonymous@hero.com",
        url("https://github.com/anonymous-hero")
      )
    )
  )
)

lazy val root =
  project
    .in(file("."))
    .settings(
      name := "some-dep",
      libraryDependencies ++= Seq(
        "dev.zio" %% "zio" % "2.0.0"
      )
    )
