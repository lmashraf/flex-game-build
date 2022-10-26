# Summary

A simple Server/Client Jetty embedded project written in Java and using Adobe Flex (AS3).

## Prerequisites

### Gradle

- gradle (version: 7.4.2+)

```
sudo add-apt-repository ppa:cwchien/gradle
sudo apt-get update
sudo apt upgrade gradle
```

### Java

- Java (version: 1.8.0_181)

```
sudo apt-get install openjdk-18-jre 
sudo update-alternatives --config java
```

### Maven

- maven (version: 3.6.0)

`sudo apt-get install maven`

## How to Build

Since the binary resulting from the Client build is needed to run the server, the build order is important.

### Client

- To start the build and packaging of the WorkClient.SWF file, simply run the commands:

```
cd client
./build.sh
```
This shall copy the shared resources and the packaged SWF to their respective locations inside `client` and `server` folders.

### Server
