FROM openjdk:8

COPY target/springboot-mysql-0.0.1-SNAPSHOT.jar springboot-mysql.jar

ENTRYPOINT ["java", "-jar", "springboot-mysql.jar"]