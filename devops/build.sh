#!/usr/bin/env bash

rm -rf bin/* && \
javac -d bin -cp src src/*.java
