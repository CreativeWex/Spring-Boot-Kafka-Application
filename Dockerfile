FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/kafka-example-0.0.1-SNAPSHOT.jar /app/kafka-example.jar
CMD ["java", "-jar", "kafka-example.jar"]
