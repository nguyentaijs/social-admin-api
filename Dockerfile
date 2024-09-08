FROM openjdk:17-alpine

WORKDIR /app

COPY target/social-admin-api.jar social-admin-api.jar

EXPOSE 9300

ENTRYPOINT ["java", "-jar", "social-admin-api.jar"]