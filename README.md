# 🧙‍♂️ Enchanted Courier Guild

## 📜 Overview
This project is a Java Maven application built using a test-driven development (TDD) approach. You are given a Maven project containing a complete test suite, but the production source code has been removed. The task is to study the tests, infer the required behavior, and implement the missing production code so that all tests pass. The system models a fantasy delivery service that plans magical package deliveries across different realms. 

## 🎯 Learning Objectives
By completing this project, you will:
* Read unit tests carefully and use them as executable specifications.
* Implement Java classes that satisfy a provided test suite.
* Organize code into meaningful packages.
* Apply core object-oriented programming principles such as encapsulation, abstraction, inheritance, and polymorphism.
* Implement and recognize common design patterns in Java.
* Use Maven to compile, test, and verify a Java project.

## 🧩 Required Design Patterns
The implementation showcases several core design patterns:
* **Strategy Pattern:** Represents different delivery cost strategies (e.g., Standard, Express, and Careful delivery calculations).
* **Abstract Factory Pattern:** Realm-specific factories (e.g., Sky Realm, Underground Realm) responsible for creating the appropriate courier creature and package seal for a delivery realm.
* **Singleton Pattern:** A guild log that records delivery activity using a single shared instance across the application.
* **Adapter Pattern:** Adapts a legacy owl-scroll notification system to work seamlessly with the modern notification interface expected by the rest of the application.

## 📦 Package Organization
| Package | Purpose <br>
|<br>
| `edu.oop.guild.model` | Core domain objects and enums |<br>
| `edu.oop.guild.creature` | Courier creature abstractions and implementations |<br>
| `edu.oop.guild.strategy` | Delivery cost strategy interface and implementations |<br>
| `edu.oop.guild.seal` | Package seal interface and implementations |<br>
| `edu.oop.guild.factory` | Realm factory abstractions and concrete factories |<br>
| `edu.oop.guild.log` | Singleton guild log |<br>
| `edu.oop.guild.notification` | Notification interface, legacy class, and adapter |<br>
| `edu.oop.guild.service` | Main delivery planning service |

## 🚀 How to Run the Project
This project uses Maven for dependency management and testing. The project also uses JaCoCo for coverage checks. 

From the root directory of the project, use the following commands:

**To run the test suite:**
```bash
mvn clean test
