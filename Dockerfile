FROM amazoncorretto:20-alpine

COPY target/mgb-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]