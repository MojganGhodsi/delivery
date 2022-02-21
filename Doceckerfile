FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/delivery-0.0.1-SNAPSHOT.jar. delivery.jar
ENTRYPOINT ["java", "-jar", "delivery.jar"]
