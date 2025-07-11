FROM openjdk:latest
ENV APP_HOME=/data
RUN mkdir -p ${APP_HOME}
COPY sentinel-dashboard.jar ${APP_HOME}/sentinel-dashboard.jar
RUN echo "Asia/Shanghai" > /etc/timezone
WORKDIR ${APP_HOME}
ENTRYPOINT ["java", "-jar", "sentinel-dashboard.jar"]