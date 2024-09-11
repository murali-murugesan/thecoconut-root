# In Development

TO RUN DAPR in LOCAL
in the current directory, RUN BELOW command

```dapr run --app-id myapp --app-port 8080 --components-path ./components -- java -jar target/*.jar```

### To publish Docker image
mvn clean install
docker build -t muralimurugesan/thecoconut-article:latest --build-arg="ARTICLE_JAR_VERSION=1.0-SNAPSHOT"   --platform linux/amd64 .
docker push muralimurugesan/thecoconut-article:latest