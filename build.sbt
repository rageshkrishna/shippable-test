
lazy val test = (
  project in file(".")
    settings (Project.defaultSettings ++ basicSettings: _ *)    
)

lazy val basicSettings = Seq[Setting[_]](
  name := "test",  
  scalaVersion := "2.11.0",    
  libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.1.3" % "test")    
)