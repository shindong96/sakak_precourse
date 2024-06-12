#!/bin/bash

# Spring Boot 프로젝트를 빌드
./gradlew bootJar

# 빌드가 성공했는지 확인.
if [ $? -eq 0 ]; then
    echo "Build succeeded. Starting Docker containers..."

    # Docker Compose로 컨테이너를 시작
    docker-compose up
else
    echo "Build failed. Please check the errors and try again."
    exit 1
fi
