FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD ./target/contacts.jar contacts.jar
ENTRYPOINT ["java", "-jar", "/contacts.jar"]


