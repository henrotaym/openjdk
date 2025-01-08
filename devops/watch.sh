#!/usr/bin/env bash

# to reload and compile when .java files are changed
nodemon --ext java \
    --watch src \
    --exec 'devops/dev.sh'