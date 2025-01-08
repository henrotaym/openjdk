#!/usr/bin/env bash

# to reload and compile when .java files are changed
nodemon --legacy-watch \
    --polling-interval 1000 \
    --ext java \
    --watch /opt/apps/app/src \
    --exec '/opt/apps/app/devops/run.sh'
    # --exec 'javac -d bin -cp src src/*.java && java -cp bin Main'