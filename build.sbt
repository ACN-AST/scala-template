name := "scala-template"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

// package (h2, squeryl) dependencies
libraryDependencies ++= Seq(
	"com.h2database" % "h2" % "latest.integration",
	"org.squeryl" %% "squeryl" % "latest.integration",
	"junit" % "junit" % "latest.integration",
	"org.scalatest" %% "scalatest" % "latest.integration" % "test",
	"com.borachio" %% "borachio-scalatest-support" % "latest.integration"
	)

// scala-swing dependency
//libraryDependencies <+= scalaVersion { "org.scala-lang" % "scala-swing" % _ }
