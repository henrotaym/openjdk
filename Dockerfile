FROM henrotaym/openjdk:23

RUN apt-get update && \
    apt-get -y install nodejs npm && \
    npm i -g nodemon gitmoji-cli

COPY . .

CMD [ "./devops/dev.sh" ]
