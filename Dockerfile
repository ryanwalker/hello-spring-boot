FROM openjdk:11.0-jdk-oracle

COPY target/APP.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]