# Custom String Builder (`MyStrBuilder`)

A custom, mutable Java implementation of a string builder built completely from scratch. This project replicates core functionalities of Java's built-in `StringBuilder` and `StringBuffer` classes without relying on any restricted Java String libraries.

##Features

* **Custom Constructors:** Initialize with a default capacity of 16, a custom specified capacity, or an existing character array.
* **Dynamic Resizing:** Automatically expands internal array capacity (doubling plus 2) when capacity is exceeded during appends or inserts.
* **Overloaded Append Methods:** Efficiently appends single characters (`char`), character arrays (`char[]`), and integers (`int`)—including edge cases like `Integer.MIN_VALUE`.
* **String Manipulations:** Supports `substring`, `toLowerCase`, `toUpperCase`, `reverse`, `insert`, `delete`, and `replace` operations.
* **Utility & Comparison:** Includes `charAt`, `length`, `capacity`, `indexOf`, and custom `equals` methods.

## Tech Stack & Concepts
* **Language:** Java
* **Testing:** JUnit framework (`myStrBuilderJunitTester`)
* **Core Concepts:** Dynamic array management, manual memory/array copying (`System.arraycopy`), algorithmic digit parsing, and exception handling.

## Testing
The project includes a comprehensive JUnit test suite (`myStrBuilderJunitTester.java`) covering constructors, boundary conditions, edge values (such as minimum/maximum integers), and all manipulation methods.

To run tests locally:
1. Open the project in **IntelliJ IDEA**.
2. Run `myStrBuilderJunitTester.java` using JUnit.
