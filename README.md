# Basic Java Programs 

All of the `.java` files need to be compiled first, follow the steps given below:

## Table of Contents:
**[How to Run Programs](#Program-Execution)<br>**
**[Basics of Java](#Introduction-to-Java)<br>**
**[Control Statements]<br>**
**[Arrays]<br>**
**[Objects]<br>**
**[Inheritance]<br>**
**[Polymorphism]<br>**
**[Abstraction]<br>**
**[Exception Handling]<br>**
**[Multithreading]<br>**
**[File Handling]<br>**

## Program Execution:

1. Compile a java program using:
`javac filename.java`

2. Execute a java program using:
`java filename`

## Dependencies:

### 1/2 Java Runtime Environment 

- Install for Ubuntu/Debian
``` 
    sudo apt-get update 
    sudo apt install default-jre
```

### 2/2 Java Development Kit

- Install for Ubuntu/Debian
```
    sudo apt install default-jdk
```

## Introduction to Java

Java is a high-level, object-oriented, class-based, secure, robust and platform indpendent language.

### Naming Conventions

| Indentifier | Naming Rule |  Example  |
|------------|-------------|-----------|
| Class/Interface | Must be a noun (person, place or thing). First letter of each word is capitalized. Avoid acronyms while keeping the name simple yet descriptive | class Bank; <br> class RapMusic; |
| Method     | Must be a verb (action or state of being). First letter is lowercase with first letter of each following word capitalized | getBalance(); <br> shoot(); <br> drive();

### Java variables 

**- local -** cannot be used outside of a method, cannot be defined as `static` <br>
**- instance -** declared inside the body of a class but outside of methods, cannot be defined as `static`, since it is different for each istance (object) of the class <br>
**- static -** is associated with the class, cannot be used with objects since it is allocated memory only once <br>
