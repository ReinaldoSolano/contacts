# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="reinaldo.solano@antikytera.com"


# Add a volume pointing to /tmp
VOLUME /tmp

ADD contacts/target/contacts.jar app.jar
# Make port 8080 available to the world outside this container
EXPOSE 8080


# Run the jar file 
ENTRYPOINT ["java","-jar","/app.jar"]


