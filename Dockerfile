FROM openjdk:20

ENV ENVIRONMENT=prod

EXPOSE 8080

LABEL maintainer="sahed.w@hotmail.de"

ADD backend/target/hanafi-fiqh-app.jar hanafi-fiqh-app.jar

CMD [ "sh", "-c", "java -jar /hanafi-fiqh-app.jar" ]