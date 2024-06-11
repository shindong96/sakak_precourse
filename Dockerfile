FROM openjdk:17-jdk-slim

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/precourse-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
