FROM eclipse-temurin:21-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /usr/src/application.jar
WORKDIR /usr/src
EXPOSE 8081
ENTRYPOINT ["java",
"-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5085",
"-Djava.security.egd=file:/dev/./urandom","-jar","application.jar"]
