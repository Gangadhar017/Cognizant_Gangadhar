# Exercise 2 - Implementing Dependency Injection

## Objective

Implement setter dependency injection using Spring XML configuration.

## Technologies

- Java 17
- Maven
- Spring Core
- XML configuration

## Dependency Injection Type

Setter injection

## Files

- `pom.xml`
- `src/main/resources/applicationContext.xml`
- `src/main/java/com/library/repository/BookRepository.java`
- `src/main/java/com/library/service/BookService.java`
- `src/main/java/com/library/LibraryManagementApplication.java`

## How to Run

```bash
mvn clean compile exec:java
```

## Expected Output

```text
Book Service Called
Fetching books from Repository
```
