FROM openjdk:8-jdk-alpine
MAINTAINER johnmichaelsantos06@gmail.com
COPY target/exam-0.0.1-SNAPSHOT.jar exam-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/exam-0.0.1-SNAPSHOT.jar"]
