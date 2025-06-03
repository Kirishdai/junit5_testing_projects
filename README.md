# JUnit 5 Testing Practice – junit5_testing_projects

This repository contains my hands-on practice with **JUnit 5** and the **Maven build tool** as part of my journey to become an enterprise-level Full-Stack Java Developer. Each folder represents a self-contained Maven project focused on writing clean, focused, and properly commented unit tests.

---

## 📁 Folder Overview

### `Junit5`
- `ReverseString.java`: Reverses a string using two-pointer swapping logic.
- `Shapes.java`: Computes the area of a square and the floored area of a circle.
- `ReverseStringTest.java`: Unit tests for string reversal logic using `assertEquals`.
- `ShapesTest.java`: Tests for shape area calculations using `assertEquals`, `assertNotEquals`, and `assertTrue`.

### `Junit5.1`
- `Course.java`: A functional interface that defines a contract for course purchasing.
- `JavaCourse.java`, `JunitCourse.java`, `SpringBootCourse.java`: Implementations of the `Course` interface representing different types of courses with custom purchase behavior.
- `PurchaseCourse.java`: A service class that calls `coursePurchased()` on any given `Course` object.
- `PurchaseCourseTest.java`: Unit tests that verify purchase logic using `assertTrue` and `assertFalse`.

### `Junit5.2`
- `SortingArray.java`: Sorts an integer array in ascending order using `Arrays.sort()`.
- `SortingArrayTest.java`: Includes both a correct `assertArrayEquals` test and an intentionally failing `assertThrows` test to demonstrate error handling.

---

##  Tools Used

- **Java 24**
- **JUnit 5**
- **Maven**
- **IntelliJ IDEA Ultimate Edition**
- **Git + GitHub**

---

##  Why This Repo Exists

This repository is part of my structured 4-month sprint to master not just Java development, but also modern testing best practices. After completing Java 8 feature fundamentals, I focused on JUnit 5 — the most widely used Java testing framework — to write clean, maintainable, and test-driven code. Each file in this repo is deliberate and designed to reflect both foundational and practical testing techniques.

---
