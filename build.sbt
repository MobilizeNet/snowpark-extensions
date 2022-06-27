name := "SnowparkExtensions"

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")


ThisBuild / scalaVersion := "2.12.10"
ThisBuild / organization := "net.mobilize"


// disable publishw ith scala version, otherwise artifact name will include scala version 
crossPaths := false

version := "0.4.0"

val snowparkVersion = "1.2.0"
val sparkVersion = "3.2.1"

libraryDependencies ++= Seq( 
  "org.scala-lang" % "scala-library" % "2.12.10",
  "com.snowflake" % "snowpark" % snowparkVersion,  
  "org.scala-lang" % "scala-library" % "2.12.10" % Test,
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,  
  "org.apache.spark" %% "spark-core" % sparkVersion % Test,
  "org.apache.spark" %% "spark-sql" % sparkVersion  % Test
)