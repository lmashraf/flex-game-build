# Summary

A simple Server/Client Jetty embedded project written in Java and using Adobe Flex (AS3).

## Prerequisites

### Gradle

- gradle (version: 7.4.2)

```
sudo add-apt-repository ppa:cwchien/gradle
sudo apt-get update
sudo apt upgrade gradle
```

### Java

- Java (version: 11.0.16 2022-07-19)

```
sudo apt-get install openjdk-11-jdk
sudo update-alternatives --config java
```

### Maven

- maven (version: 3.6.0)

```
cd /opt
wget -O- https://archive.apache.org/dist/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.tar.gz |
sudo tar -xzv
export PATH=$PATH:$/opt/apache-maven-3.6.0/bin/
```

## How to Run

From the root folder of the repository, simply run `cd server && ./bin/start.sh` this shall execute the Client build first, insure all the necessary preconditions, and then run the server accordingly.