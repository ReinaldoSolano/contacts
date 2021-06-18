#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY contacts/target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
FROM maven:3.6.2-jdk-8-slim AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn clean package

FROM openjdk:8-jre

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/contacts.jar /app/

ENTRYPOINT ["java", "-jar", "contacts.jar"]

