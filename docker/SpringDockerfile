FROM openjdk:8-jre-alpine
COPY ./build/libs/ShoppingAppBackend-0.0.1-SNAPSHOT.jar /usr/src/app/
WORKDIR /usr/src/app
EXPOSE 8080
CMD ["java", "-jar", "ShoppingAppBackend-0.0.1-SNAPSHOT.jar"]