FROM openjdk:17

COPY ./target/myGame.war ./myGame.war
ENV PORT=8080
EXPOSE 8080
CMD ["java","-jar","myGame.war"]