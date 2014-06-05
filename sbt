#!/bin/sh
test -f ~/.sbtconfig && . ~/.sbtconfig
exec java -Xms512m -Xmx2G ${SBT_OPTS} -jar ./sbt-launch.jar "$@"
