# Exercise 2 – Verifying Interactions using Mockito

## Objective

Learn how to verify that methods on mock objects are invoked with the expected arguments using Mockito.

---

## Technologies Used

- Java 17
- Maven
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-2-Verifying-Interactions
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

Represents an external dependency.

```java
public interface ExternalApi {

    String getData();

    void sendData(String message);

}
```

---

### MyService

Uses the `ExternalApi` dependency.

```java
public String fetchData() {
    return externalApi.getData();
}

public void saveData(String message) {
    externalApi.sendData(message);
}
```

---

## Mockito Concepts

### Creating a Mock

```java
ExternalApi mockApi = mock(ExternalApi.class);
```

Creates a fake implementation of the `ExternalApi` interface.

---

### Verifying a Method Call

```java
verify(mockApi).getData();
```

Checks that `getData()` was invoked.

---

### Verifying a Method with Arguments

```java
verify(mockApi).sendData("Hello Mockito");
```

Ensures that `sendData()` was called with the exact argument.

---

## Test Flow (AAA Pattern)

### Arrange

- Create the mock object.
- Inject the mock into `MyService`.

### Act

Call the method under test.

### Assert

Use `verify()` to confirm that the expected interaction occurred.

---

## Run the Tests

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

- Create mock objects.
- Verify method invocations.
- Verify method arguments.
- Understand interaction-based testing.
- Write isolated unit tests using Mockito.
