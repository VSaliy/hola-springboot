\backend
mvn clean install jetty:run
curl -X GET http://localhost:8080/api/backend?greeting=Hello

\hola-springboot
gradle build
gradle bootJar
java -jar build/libs/hola-springboot-1.0.jar