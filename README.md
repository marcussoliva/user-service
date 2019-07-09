##### - Build project 
- ./gradlew build 

##### - Deploy a container
- ./gradlew build && docker build --tag=user-service . && docker run -d --publish=8080:8080 user-service:latest

