
# Use the Java 17 runtime image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven JAR into the image
COPY target/*.jar app.jar

# Document the application port
EXPOSE 8080

# Run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
