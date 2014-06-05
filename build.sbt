name := "com.github.jiahut.demo"

version := "0.2"

scalaVersion := "2.10.4"

sbtVersion := "0.13.1"

javaHome := Some(file("/home/jazz/dev/jdk1.7.0_25"))

seq(webSettings : _*)

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.0.2.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-data-jpa" % "1.0.2.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-jetty" % "1.0.2.RELEASE",
  // "org.springframework.boot" % "spring-boot-starter-tomcat" % "1.0.2.RELEASE" % "provided",
  // "org.springframework.boot" % "spring-boot-starter-web" % "1.1.0.BUILD-SNAPSHOT",
  // "org.springframework.boot" % "spring-boot-starter-data-jpa" % "1.1.0.BUILD-SNAPSHOT",
  // "org.springframework.boot" % "spring-boot-starter-jetty" % "1.1.0.BUILD-SNAPSHOT",
  // "org.springframework.boot" % "spring-boot-starter-tomcat" % "1.1.0.BUILD-SNAPSHOT" % "provided",
  "org.hsqldb" % "hsqldb" % "2.3.2",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "javax.servlet" % "jstl" % "1.2" % "provided"
)

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.5.v20140505" % "container, compile",
  "org.eclipse.jetty" % "jetty-plus" % "9.1.5.v20140505" % "container"
)

// libraryDependencies ++= Seq(
//   "org.apache.tomcat.embed" % "tomcat-embed-core"         % "8.0.8" % "container",
//   "org.apache.tomcat.embed" % "tomcat-embed-logging-juli" % "8.0.8" % "container",
//   "org.apache.tomcat.embed" % "tomcat-embed-jasper"       % "8.0.8" % "container"
// )

// Repositories
// resolvers += "Maven Central Server" at "http://repo1.maven.org/maven2"
resolvers += "Spring snapshot repository"  at "http://maven.springframework.org/snapshot"

// set fullClasspath in Runtime += Attributed.blank(file("/home/jazz/dev/jdk1.7.0_25/jre/lib/rt.jar"))
unmanagedJars in Compile += file("/home/jazz/dev/jdk1.7.0_25/jre/lib/rt.jar")
