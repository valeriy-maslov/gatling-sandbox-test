package computerdatabase

import java.nio.file.Paths

object IDEPathHelper {

  val projectRootDir = Paths.get(getClass.getClassLoader.getResource("gatling.conf").toURI).getParent.getParent.getParent
  val mavenTargetDirectory = projectRootDir.resolve("target")
  val mavenSrcTestDirectory = projectRootDir.resolve("src").resolve("test")

  val mavenSourcesDirectory = mavenSrcTestDirectory.resolve("scala")
  val mavenResourcesDirectory = mavenSrcTestDirectory.resolve("resources")
  val mavenBinariesDirectory = mavenTargetDirectory.resolve("test-classes")
  val resultsDirectory = mavenTargetDirectory.resolve("gatling")
  val recorderConfigFile = mavenResourcesDirectory.resolve("recorder.conf")
}