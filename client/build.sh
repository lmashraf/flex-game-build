#!/bin/bash

export SHARED_RESOURCE="../shared/resources/levels/requiredScores.json"
export CLIENT_RESOURCE_TARGET_DIR="generated"
export SERVER_RESOURCE_TARGET_DIR="../server/web/"

# Create 'generated' folder
mkdir -p ./${CLIENT_RESOURCE_TARGET_DIR}
echo "Created client/${CLIENT_RESOURCE_TARGET_DIR}/ folder."

# Copy shared resources to 'generated' folder
cp -v  ${SHARED_RESOURCE} ${CLIENT_RESOURCE_TARGET_DIR}
echo "Copied shared resources to ${CLIENT_RESOURCE_TARGET_DIR}."

# Build SWF file
echo "Packaging source to target/WorkClient-{version_number}.swf..."
mvn clean && mvn package

# Copy file to the server's dependency while renaming it
mv -v $(find . | grep .swf) ${SERVER_RESOURCE_TARGET_DIR}\WorkClient.swf
echo "Copied WorkClient to ${SERVER_RESOURCE_TARGET_DIR}"