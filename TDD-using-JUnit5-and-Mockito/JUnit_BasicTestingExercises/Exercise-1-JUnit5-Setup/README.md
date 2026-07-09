# Exercise 1 – Setting Up JUnit 5

## Objective

Set up a Maven Java project with JUnit 5 and Mockito to begin writing unit tests.

---

## Technologies Used

- Java 17
- Maven
- JUnit 5 (Jupiter)
- Mockito

---

## Project Structure

```
Exercise-1-JUnit5-Setup
│
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
```

---

## Dependencies

- JUnit Jupiter
- Mockito Core
- Mockito JUnit Jupiter
- Maven Surefire Plugin

---

## Source Class

`Calculator.java` contains one method:

```java
public int add(int a, int b)
```

---

## Test Class

`CalculatorTest.java` verifies that:

- `add(2,3)` returns `5`

using

```java
assertEquals(5, calculator.add(2,3));
```

---

## Run Tests

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

After completing this exercise you will understand:

- Maven project structure
- JUnit 5 setup
- Test source folder (`src/test/java`)
- Writing the first unit test
- Using `@Test`
- Using assertions
- Running tests with Maven
