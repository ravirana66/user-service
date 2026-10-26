# Use a lightweight OpenJDK runtime
FROM eclipse-temurin:21-jre

# Create application user and group
RUN groupadd -r appuser && useradd -r -g appuser appuser

# Set working directory
WORKDIR /app

# Copy jar and set ownership
COPY --chown=appuser:appuser target/*.jar app.jar

# Switch to non-root user
USER appuser

# Expose application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]