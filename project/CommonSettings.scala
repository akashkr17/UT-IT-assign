import sbt._

object CommonSettings {

  lazy val projectSettings = Seq(

  )
  def baseProject(name: String): Project = {
    Project(name, file(name))
  }
}
