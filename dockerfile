# Imagen base
FROM openjdk:19-jdk-slim
WORKDIR /app
COPY target/filmrater-0.0.1-SNAPSHOT.jar /app
EXPOSE 8001
CMD ["java", "-jar", "filmrater-0.0.1-SNAPSHOT.jar"]