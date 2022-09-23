FROM tomcat:9.0.65

EXPOSE 8080
working-directory: E:\java\projects\sd
COPY ./target/myGame.war /usr/local/tomcat/webapps/ROOT.war
