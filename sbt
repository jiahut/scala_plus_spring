#!/bin/sh
test -f ~/.sbtconfig && . ~/.sbtconfig
exec java -Xmx1024M ${SBT_OPTS} -jar ./sbt-launch.jar "$@"
