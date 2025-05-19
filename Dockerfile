FROM amazoncorretto:21-alpine-jdk
MAINTAINER Raul
COPY target/Tienda-1.jar  Raul-app.jar
ENTRYPOINT ["java","-jar","/Raul-app.jar"]

