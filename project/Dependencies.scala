import sbt._

object Dependencies {

  object  Version {
    val ScalaTestVersion = "3.2.9"
  }
  object Libraries {
    val scalaTest  = "org.scalatest" %% "scalatest" % Version.ScalaTestVersion % Test
    val mockito = "org.mockito" % "mockito-core" % "3.6.0" % Test
  }

  val testDependencies: Seq[sbt.ModuleID] =
    Seq(Libraries.scalaTest,Libraries.mockito)


}

