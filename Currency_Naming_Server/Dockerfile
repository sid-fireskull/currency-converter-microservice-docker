FROM openjdk:17.0.1-jdk-slim
COPY target/*.jar app.jar
EXPOSE 5000
ENTRYPOINT [ "java","-jar","/app.jar" ]