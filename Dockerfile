FROM openjdk:11
EXPOSE 1950
COPY target/sbtestapp.jar sbtestapp.jar
ENTRYPOINT ["java", "-jar", "/sbtestapp.jar"]