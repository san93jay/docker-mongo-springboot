# syntax=docker/dockerfile:1
FROM openjdk:16-alpine3.13
ADD target/springboot-mongodb-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]



# syntax=docker/dockerfile:1

# FROM openjdk:16-alpine3.13

# WORKDIR /app

# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline

# COPY src ./src

# CMD ["./mvnw", "spring-boot:run","-Dspring-boot.run.profiles=mongo"]