FROM openjdk:25-jdk-bullseye
ADD target/student-app.jar student-app.jar
ENTRYPOINT ["java", "-jar",  "/student-app.jar"]