FROM openjdk:8
COPY /build/libs/employee.jar app.jar
VOLUME /tmp
EXPOSE 8080
RUN bash -c 'touch app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/test", "-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]