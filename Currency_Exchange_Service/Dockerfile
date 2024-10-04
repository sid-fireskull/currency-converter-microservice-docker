FROM openjdk:17.0.1-jdk-slim
COPY target/*.jar app.jar
EXPOSE 8110
ENTRYPOINT [ "java","-jar","/app.jar" ]