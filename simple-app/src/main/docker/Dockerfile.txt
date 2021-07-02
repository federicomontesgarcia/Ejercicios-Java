FROM dockerfile/java:oracle-java8

ADD simple-app.jar /opt/simple-app/
EXPOSE 8080
WORKDIR /opt/simple-app/
CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "simple-app.jar"]