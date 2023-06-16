FROM openjdk:11-jdk

# Установка Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Копирование исходного кода приложения в образ
COPY . /app

# Установка рабочей директории
WORKDIR /app

# Сборка приложения с помощью Maven
RUN mvn clean package

# Определение точки входа в приложение
ENTRYPOINT ["java", "-jar", "/app/target/<your-jar-file>.jar"]
