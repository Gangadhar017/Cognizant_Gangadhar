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

## Viva Questions

1. What is SLF4J?
   SLF4J is a logging API that provides a common interface for logging frameworks like Logback and Log4j2.

2. Why is Logback used?
   Logback is a logging implementation that works with SLF4J and provides flexible configuration.

3. Why use LoggerFactory?
   LoggerFactory creates Logger instances for a specific class.

4. What is the difference between WARN and ERROR?
   WARN indicates a potential issue where the application can continue, while ERROR indicates a serious problem.

5. Where should logback.xml be placed?
   It should be placed inside src/main/resources so it is loaded at runtime.
