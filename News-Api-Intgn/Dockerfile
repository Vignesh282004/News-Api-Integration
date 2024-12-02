# Step 1: Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory in the container
WORKDIR /app

# Step 3: Copy the jar file from the local machine to the container
COPY target/News-Api-Intgn-0.0.1-SNAPSHOT.jar /app/News-Api-Intgn.jar

# Step 4: Expose the port your Spring Boot app will run on
EXPOSE 8080

# Step 5: Run the Spring Boot app when the container starts
ENTRYPOINT ["java", "-jar", "News-Api-Intgn.jar"]
