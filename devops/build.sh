#!/usr/bin/env bash

rm -r bin/* && \
javac -d bin -cp src src/*.java
