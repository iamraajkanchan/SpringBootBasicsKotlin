# Use the official OpenJDK base image for Java 21
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file built by Gradle/Maven to the container
COPY build/libs/SpringBootBasicsKotlin-0.0.1-SNAPSHOT.jar /app/SpringBootBasicsKotlin.jar

# Set environment variables for database connection
ENV SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/chinky_laptop_test_database
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=rajmysqlkanchan16

# Expose the port your application runs on
EXPOSE 8080

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "/app/SpringBootBasicsKotlin.jar"]
