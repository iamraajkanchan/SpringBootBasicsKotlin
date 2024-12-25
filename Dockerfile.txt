# Use the official OpenJDK base image for Java 11
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file built by Gradle/Maven to the container
COPY build/libs/your-application-name.jar /app/your-application-name.jar

# Expose the port your application runs on
EXPOSE 8080

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "/app/your-application-name.jar"]