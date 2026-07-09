# Exercise 3 – Assertions in JUnit 5

## Objective

Learn how to validate expected results using different JUnit 5 assertion methods.

---

## Technologies Used

- Java 17
- Maven
- JUnit 5

---

## Project Structure

```
Exercise-3-Assertions
│
├── pom.xml
├── README.md
├── src
│   ├── main
│   └── test
```

---

## Assertions Used

### 1. assertEquals()

Checks whether expected and actual values are equal.

Example:

```java
assertEquals(5, calculator.add(2,3));
```

---

### 2. assertNotEquals()

Checks that two values are different.

```java
assertNotEquals(6, calculator.add(2,3));
```

---

### 3. assertTrue()

Checks whether a condition is true.

```java
assertTrue(10 > 5);
```

---

### 4. assertFalse()

Checks whether a condition is false.

```java
assertFalse(5 > 10);
```

---

### 5. assertNull()

Checks whether an object reference is null.

```java
assertNull(name);
```

---

### 6. assertNotNull()

Checks whether an object is not null.

```java
assertNotNull(calculator);
```

---

### 7. assertSame()

Checks whether two references point to the same object.

```java
assertSame(obj1, obj2);
```

---

### 8. assertNotSame()

Checks that two references point to different objects.

```java
assertNotSame(obj1, obj2);
```

---

### 9. assertArrayEquals()

Checks whether two arrays contain the same elements.

```java
assertArrayEquals(expected, actual);
```

---

## Running the Tests

```
mvn test
```

---

## Expected Result

```
BUILD SUCCESS
```

---

## Learning Outcomes

- Understand JUnit 5 assertions.
- Verify expected outputs.
- Validate boolean conditions.
- Test object references.
- Test arrays.
- Write readable and reliable unit tests.
