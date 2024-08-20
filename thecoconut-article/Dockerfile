FROM openjdk:17-jdk-slim AS build
LABEL maintainer="murugesan.murali@gmail.com"
VOLUME /tmp
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/thecoconut-article-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
