FROM maven:3.8.4-openjdk-17-slim AS MAVEN_BUILD

COPY ./ ./

RUN mvn clean package -DskipTests

FROM openjdk:17

COPY --from=MAVEN_BUILD /target/KarenWeb-0.0.1-SNAPSHOT.jar /karen.jar

CMD ["java","-jar","/karen.jar"]