FROM openjdk:21

WORKDIR /app

COPY ./build/libs/authorization-server-0.0.1-SNAPSHOT.jar .

EXPOSE 9000

CMD ["java", "-jar", "authorization-server-0.0.1-SNAPSHOT.jar"]