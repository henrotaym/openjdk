FROM henrotaym/openjdk:23

RUN apt-get update && \
    apt-get -y install nodejs npm && \
    npm i -g nodemon

COPY . .

# CMD [ "./devops/nodemon.sh" ]
