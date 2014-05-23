# Scala plus Spring

### Instal

install and config `sbt` 

### Config

To run the webapp you use sbt, although it can be a memory hog so you might want to add this to your environment or profile `~/.sbtconfig`

    export SBT_OPTS=-XX:MaxPermSize=2048M

### Run

Then start container within `sbt` shell

    > container:start # this start the application in an embedded Jetty web container.

### Package

To build a deployable file (WAR - Web ARchive) you can run `sbt` and run the following command:

    > package

### IntelliJ

There is a plugin which will build IntelliJ project files, run `sbt` and run the following command

    > gen-idea

### eclipse

There is a plugin which will build eclipse project files, run following conmand within `sbt` shell

    > eclipse

enjoy.
