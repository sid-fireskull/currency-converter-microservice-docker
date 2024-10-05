FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /home/app

COPY ./pom.xml /home/app/pom.xml
COPY ./src/main/java/com/microservices/api/gateway/CurrencyApiGatewayApplication.java /home/app/src/main/java/com/microservices/api/gateway/CurrencyApiGatewayApplication.java
RUN mvn -f /home/app/pom.xml clean package

COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17.0.1-jdk-slim
COPY target/*.jar app.jar
EXPOSE 80
ENTRYPOINT [ "java","-jar","/app.jar" ]