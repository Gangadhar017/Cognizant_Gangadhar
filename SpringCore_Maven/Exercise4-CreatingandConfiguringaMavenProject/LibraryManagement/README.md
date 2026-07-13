# Exercise 4 - Creating and Configuring a Maven Project

## Objective

Create a Maven project for the library management application and configure the required Spring Framework dependencies.

## Technologies Used

- Java 8
- Maven
- Spring Context
- Spring AOP
- Spring Web MVC

## Project Structure

```text
LibraryManagement
|
|-- pom.xml
|-- README.md
|-- src
|   |-- main
|   |   |-- java
|   |   |   `-- com
|   |   |       `-- library
|   |   `-- resources
|   `-- test
|       `-- java
```

## Dependencies

- `spring-context`
- `spring-aop`
- `spring-webmvc`

## Maven Plugin

- Maven Compiler Plugin `3.13.0`
- Java source version: `1.8`
- Java target version: `1.8`

## Build Commands

```bash
mvn clean
mvn compile
mvn test
mvn package
```
