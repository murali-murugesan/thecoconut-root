# In Development

### To publish Docker image
mvn clean install
docker build -t muralimurugesan/thecoconut-article:latest --build-arg="ARTICLE_JAR_VERSION=1.0-SNAPSHOT"   --platform linux/amd64 .
docker push muralimurugesan/thecoconut-article:latest