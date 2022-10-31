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

## How to Run

From the root folder of the repository, simply run `cd server && ./bin/start.sh` this shall execute the Client build first, insure all the necessary preconditions, and then run the server accordingly.

## TODO:

Following error needs to be fixed 

```
javax.servlet.ServletException: org.apache.jasper.JasperException: Unable to compile class for JSP
```

- It may be related to either an incompatibility between the dependencies used on the Server gradle build and/or a misconfiguration with the web resources path when accessing it from WebServer.java file, which needs investigating.