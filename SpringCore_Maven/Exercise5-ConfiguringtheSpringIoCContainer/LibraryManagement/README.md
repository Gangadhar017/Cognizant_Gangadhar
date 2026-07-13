# Exercise 5 - Configuring the Spring IoC Container

## Objective

Configure the Spring IoC container using an XML configuration file and verify that it creates and wires application beans.

## Technologies Used

- Java 17
- Maven
- Spring Core
- XML configuration

## Files

- `pom.xml`
- `src/main/resources/applicationContext.xml`
- `src/main/java/com/library/LibraryManagementApplication.java`
- `src/main/java/com/library/service/BookService.java`
- `src/main/java/com/library/repository/BookRepository.java`

## IoC Configuration

The Spring container loads `applicationContext.xml`, creates the `BookRepository` and `BookService` beans, and injects `BookRepository` into `BookService` using setter injection.

## How to Run

```bash
mvn clean compile exec:java
```

## Expected Output

```text
Spring IoC Container Loaded
Book Service Called
Fetching books from Repository
```
