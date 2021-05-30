FROM maven:3-openjdk-15-slim AS build
WORKDIR /app
COPY . .
RUN mvn -B package

FROM maven:3-openjdk-15-slim
WORKDIR /app
COPY --from=build /app/target/k8s-backend-1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]
EXPOSE 8080