# Use the official OpenJDK base image for Java 11
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the main JAR file built by Gradle/Maven to the container
COPY build/libs/SpringBootBasicsKotlin-0.0.1-SNAPSHOT.jar /app/SpringBootBasicsKotlin.jar

# Expose the port your application runs on
EXPOSE 8080

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "/app/SpringBootBasicsKotlin.jar"]
