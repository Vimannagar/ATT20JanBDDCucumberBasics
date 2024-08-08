FROM maven:3.9.8-eclipse-temurin-11-alpine
RUN apk add jq
RUN apk add curl
COPY src /home/seleniumcucumbertestframework/src
COPY pom.xml /home/seleniumcucumbertestframework
COPY testng.xml /home/seleniumcucumbertestframework
COPY runner.sh runner.sh
RUN dos2unix runner.sh
RUN mvn -f /home/seleniumcucumbertestframework/pom.xml clean test -DskipTests=true
ENTRYPOINT sh runner.sh