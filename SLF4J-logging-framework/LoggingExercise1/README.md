# Exercise 1: Logging Error Messages and Warning Levels

## Task

Write a Java application that demonstrates logging error messages and warning levels using SLF4J.

## Project Structure

```text
LoggingExercise1/
|-- pom.xml
`-- src/
    `-- main/
        |-- java/
        |   `-- com/
        |       `-- cognizant/
        |           `-- logging/
        |               `-- LoggingExample.java
        `-- resources/
            `-- logback.xml
```

## Dependencies

- SLF4J API
- Logback Classic

## Run

```bash
mvn compile exec:java -Dexec.mainClass="com.cognizant.logging.LoggingExample"
```

## Expected Output

```text
15:10:02 INFO  com.cognizant.logging.LoggingExample - Application Started
15:10:02 WARN  com.cognizant.logging.LoggingExample - This is a warning message.
15:10:02 ERROR com.cognizant.logging.LoggingExample - This is an error message.
15:10:02 INFO  com.cognizant.logging.LoggingExample - Application Finished
```
