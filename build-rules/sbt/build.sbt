import sbt.complete._

organization := "edu.berkeley.cs"
version := "1.0.0"
name := "api-config-chipsalliance"
scalaVersion := "2.12.10"

scalaSource in Compile := baseDirectory.value / "../../design/craft/src"
