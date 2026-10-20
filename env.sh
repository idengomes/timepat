#!/bin/sh
if [ -z "$JAVA_HOME" ]; then
	echo "JAVA_HOME not defined" >&2
	exit 1
fi

if ! export -p | grep -q "JAVA_HOME="; then
	echo "JAVA_HOME is defined, but not exported" >&2
	exit 2
fi

export MAVEN_HOME="$(pwd)/vendor/apache-maven-3.10.0"

export PATH="$PATH:$MAVEN_HOME/bin:$JAVA_HOME/bin"
