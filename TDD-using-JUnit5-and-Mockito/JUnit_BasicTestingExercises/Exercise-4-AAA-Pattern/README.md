# Exercise 4 – Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown

## Objective

Learn how to organize JUnit 5 tests using the Arrange-Act-Assert (AAA) pattern and use setup and teardown methods to prepare and clean up test fixtures.

---

## Technologies Used

- Java 17
- Maven
- JUnit 5

---

## Project Structure

```
Exercise-4-AAA-Pattern
│
├── pom.xml
├── README.md
├── src
│   ├── main
│   └── test
```

---

## Arrange-Act-Assert (AAA) Pattern

### 1. Arrange

Prepare the required objects and input values.

```java
int a = 10;
int b = 20;
```

### 2. Act

Call the method under test.

```java
int result = calculator.add(a, b);
```

### 3. Assert

Verify the expected outcome.

```java
assertEquals(30, result);
```

---

## Test Fixtures

A **test fixture** is the set of objects and data required before executing a test. In this exercise, the `Calculator` object is the test fixture.

---

## Setup Method

`@BeforeEach` runs **before every test method**.

```java
@BeforeEach
void setUp() {
    calculator = new Calculator();
}
```

---

## Teardown Method

`@AfterEach` runs **after every test method**.

```java
@AfterEach
void tearDown() {
    calculator = null;
}
```

---

## Running the Tests

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

- Understand the Arrange-Act-Assert (AAA) pattern.
- Create reusable test fixtures.
- Use `@BeforeEach` for test setup.
- Use `@AfterEach` for cleanup.
- Write clean, maintainable, and independent unit tests.
