# springboot-gradle-autorefrsh

- Jalankan di terminal baru
  ```bash
  .\gradlew build --continuous
  ```
- Buka kembali terminal baru
  ```bash
  .\gradlew bootRun
  ```
- Create Gradle Project 1 command
  ```bash
  echo no | gradle init --type java-application --test-framework junit --dsl groovy --project-name NamaProyek --package com.example --project-dir ./NamaProyek --no-daemon
  ```
