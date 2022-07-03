mvn clean install -DskipTests=true
mv ./target/nosql-ipc-test-app-0.0.1-SNAPSHOT.jar ./docker/app/app.jar
cd ./docker || exit 1

docker-compose up
