#!/bin/bash

mkdir ./generated
echo "Created client/generated/ folder."

cp -v ../shared/resources/levels/requiredScores.json ./generated
echo "Copied requiredScores.json file."

echo "Packaging source to target/WorkClient.swf..."
mvn clean && mvn package

# Clean
rm -rf ./generated