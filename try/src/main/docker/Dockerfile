FROM java:8
VOLUME /tmp
ADD C:\Users\ca_user1\eclipse-workspace\try\target\try-0.0.1-SNAPSHOT.jar app.jar 
RUN bash -c "touch /app.jar"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom",".jar","/app.jar"] 
