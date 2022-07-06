inThisBuild(
  List(
    name           := "my-lib",
    normalizedName := "my-lib",
    organization   := "io.github.kitlangton",
    scalaVersion   := "2.13.8",
    licenses       := List("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0")),
    developers := List(
      Developer(
        "kitlangton",
        "Kit Langton",
        "kit.langton@gmail.com",
        url("https://github.com/kitlangton")
      )
    )
  )
)

lazy val someDepLocal =
  RootProject(file("/Users/kit/code/local-deps/some-dep"))

lazy val root =
  project
    .in(file("."))
    .settings(
      libraryDependencies ++= Seq(
        "dev.zio" %% "zio" % "2.0.0"
//        "io.github.anonymous-hero" %% "some-dep" % "0.0.0+1-cb82c254+20220706-1650-SNAPSHOT"
      )
    )
    .dependsOn(someDepLocal)
