#!/bin/bash
export CLIENT_DIR="../client"
export SERVER_DIR="../server"

# Build the client
echo "## Building the Game Client..."

cd ${CLIENT_DIR}
./build_client.sh

# Build and run the Server
echo "## Running the Game Server..."
cd ${SERVER_DIR}
gradle run