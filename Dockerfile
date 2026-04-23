# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy your JAR file into container
COPY out/artifacts/supermarket_System/supermarket-system.jar app.jar

# Expose port (if your app uses one, otherwise optional)
EXPOSE 8080

# Command to run your app
ENTRYPOINT ["java", "-jar", "app.jar"]