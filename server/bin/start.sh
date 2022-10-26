#!/bin/bash

JAVA_STARTER="com.king.worktest.Starter"
CLASSPATH=$(find -name 'server.jar';)

echo 'Executing: ' $(echo $CLASSPATH)

java -cp $CLASSPATH $JAVA_STARTER