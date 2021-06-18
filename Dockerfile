FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
RUN echo "PWD is: $PWD"
ADD ./target/contacts.jar contacts.jar
ENTRYPOINT ["java", "-jar", "/contacts.jar"]


