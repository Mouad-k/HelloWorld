FROM openjdk:17-slim
WORKDIR /app
COPY target/HelloWorld-0.0.1-SNAPSHOT.jar /app/HelloWorld-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "HelloWorld-0.0.1-SNAPSHOT.jar"]

