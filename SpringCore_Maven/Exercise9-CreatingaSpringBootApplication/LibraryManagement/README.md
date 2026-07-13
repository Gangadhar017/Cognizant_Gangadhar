# Exercise 9 - Creating a Spring Boot Application

## Objective

Create a Spring Boot application for the library management system with REST endpoints, Spring Data JPA, and an H2 in-memory database.

## Technologies Used

- Java 17
- Maven
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

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
|   |   |           |-- LibraryManagementApplication.java
|   |   |           |-- controller
|   |   |           |   `-- BookController.java
|   |   |           |-- entity
|   |   |           |   `-- Book.java
|   |   |           `-- repository
|   |   |               `-- BookRepository.java
|   |   `-- resources
|   |       `-- application.properties
|   `-- test
|       `-- java
|           `-- com
|               `-- library
|                   `-- LibraryManagementApplicationTests.java
```

## API Endpoints

| Method | Endpoint          | Description       |
| ------ | ----------------- | ----------------- |
| GET    | `/api/books`      | Get all books     |
| GET    | `/api/books/{id}` | Get book by ID    |
| POST   | `/api/books`      | Create a book     |
| PUT    | `/api/books/{id}` | Update a book     |
| DELETE | `/api/books/{id}` | Delete a book     |

## How to Run

```bash
mvn spring-boot:run
```

The application starts on `http://localhost:8080`.

## H2 Console

Open `http://localhost:8080/h2-console`.

Use these settings:

```text
JDBC URL: jdbc:h2:mem:librarydb
Username: sa
Password:
```

## Sample Request

```bash
curl -X POST http://localhost:8080/api/books ^
  -H "Content-Type: application/json" ^
  -d "{\"title\":\"Clean Code\",\"author\":\"Robert C. Martin\",\"isbn\":\"9780132350884\",\"publishedYear\":2008}"
```

## Build and Test

```bash
mvn clean test
mvn clean package
```
