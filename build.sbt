name := "scalawing"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"
  
libraryDependencies ++= Seq(
	"com.h2database" % "h2" % "latest.integration",
	"org.squeryl" %% "squeryl" % "0.9.4"
	)