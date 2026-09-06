# Homework 1 — Enhanced Calculator

## Objective

The objective of this homework is to extend the existing `Calculator1` class by adding advanced operations and improving test coverage using JUnit 5.

The homework focuses on testing normal, boundary, and exceptional cases while using test lifecycle methods to initialize and reset the calculator instance.

## Implementation and Tasks Completed

The `Calculator1.java` class was enhanced with the following operations:

* `power(int base, int exp)` — calculates the power of a number.
* `modulus(int a, int b)` — calculates the remainder and throws `IllegalArgumentException` when `b = 0`.

The following tasks were completed:

* Added the `power()` operation.
* Added the `modulus()` operation with exception handling.
* Created JUnit 5 tests for normal, boundary, and exceptional cases.
* Used `@BeforeEach` to initialize the calculator instance before each test.
* Used `@AfterEach` to reset the calculator instance after each test.
* Generated a code-coverage report in NetBeans.
* All 4 test cases passed successfully.

## How to Run

### Run the Code

1. Open the project in NetBeans IDE.
2. Open `Calculator1.java`.
3. Run the Java project or class.

### Run the Tests

1. Open `Calculator1Test.java`.
2. Right-click the test file.
3. Select **Test File** to run the JUnit 5 tests.

If the project is configured with Maven, tests can also be run using:

```bash
mvn test
```

## Test Result

The following test cases were completed:

* **TC-01:** `power(2, 3)` → `8` — PASS
* **TC-02:** `power(5, 0)` → `1` — PASS
* **TC-03:** `modulus(10, 3)` → `1` — PASS
* **TC-04:** `modulus(10, 0)` → `IllegalArgumentException` — PASS

**Overall Result: PASS — 4/4 test cases passed.**

## Code Coverage

A code-coverage report was generated in NetBeans to measure how much of the calculator implementation was exercised by the JUnit tests.

**Coverage:** Recorded in the submitted NetBeans coverage screenshot.

## Reflection

This homework improved my understanding of how comprehensive testing can increase software quality. By adding power and modulus operations, I had to test both normal and boundary conditions. Testing modulus by zero also helped me understand the importance of exception handling. Using `@BeforeEach` and `@AfterEach` made the tests more organized by ensuring that the calculator instance was properly initialized and reset for each test. The code-coverage report provided a clear indication of which parts of the implementation were tested. Overall, these practices made the testing process more reliable and helped identify potential issues before they could affect the program.
