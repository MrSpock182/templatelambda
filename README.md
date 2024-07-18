mvn -N io.takari:maven:wrapper

mvn clean -Pnative package -DskipTests

docker build -t al2023-graalvm21:native-web .

docker run -it -v `pwd`:`pwd` -w `pwd` -v ~/.m2:/root/.m2 al2023-graalvm21:native-web ./mvnw clean -Pnative package -DskipTests

sam deploy --guided