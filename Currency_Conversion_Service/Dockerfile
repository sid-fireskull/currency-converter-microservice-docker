FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /home/app
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /home/app/target/*.jar app.jar
EXPOSE 8100
ENTRYPOINT [ "java","-jar","/app.jar" ]