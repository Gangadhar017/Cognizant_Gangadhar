# Exercise 1 – Mocking and Stubbing using Mockito

## Objective

Learn how to isolate a class from its external dependencies using Mockito by creating mock objects and stubbing method behavior.

---

## Technologies Used

- Java 17
- Maven
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-1-Mocking-Stubbing
│
├── pom.xml
├── README.md
├── src
│   ├── main
│   └── test
```

---

## Classes

### ExternalApi

Represents an external dependency such as a REST API or third-party service.

```java
public interface ExternalApi {
    String getData();
}
```

---

### MyService

Depends on `ExternalApi`.

```java
public String fetchData() {
    return externalApi.getData();
}
```

---

## Mockito Concepts

### Mocking

Creates a fake implementation of an object.

```java
ExternalApi mockApi = mock(ExternalApi.class);
```

---

### Stubbing

Defines the behavior of a mocked method.

```java
when(mockApi.getData()).thenReturn("Mock Data");
```

---

### Verification

Checks that a method was called.

```java
verify(mockApi).getData();
```

---

## Test Flow (AAA Pattern)

### Arrange

- Create the mock object.
- Stub the return value.
- Create the service using the mock.

### Act

Call:

```java
service.fetchData();
```

### Assert

Verify:

```java
assertEquals("Mock Data", result);
```

---

## Run the Test

```bash
mvn test
```

---

## Expected Result

```
BUILD SUCCESS
```

---

## Learning Outcomes

- Understand mocking.
- Understand stubbing.
- Isolate dependencies during testing.
- Use `when().thenReturn()`.
- Verify interactions using `verify()`.
