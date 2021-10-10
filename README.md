# Object-Oriented Programming with Java&#x2122;

## Table of Contents:
**[How to Run Programs](#Program-Execution)<br>**
**[Basics of Java](#Introduction-to-Java)<br>**
**[Control Statements]<br>**
**[Arrays]<br>**
**[Methods]<br>**
**[Objects]<br>**
**[Inheritance]<br>**
**[Polymorphism]<br>**
**[Abstraction]<br>**
**[Packages]<br>**
**[Exception Handling]<br>**
**[Multithreading]<br>**
**[File Handling]<br>**

## Program Execution:

All of the `.java` files need to be compiled first, follow the steps given below:

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
| Classes/Interfaces | Must be a noun (person, place or thing). First letter of each word is capitalized. Avoid acronyms while keeping the name simple yet descriptive | class Bank; <br> class RapMusic; |
| Methods    | Must be a verb (action or state of being). First letter is lowercase with first letter of each following word capitalized (mixed case)| getBalance(); <br> shoot(); <br> drive(); |
|Variables   | Variable name should indicate the intent of its use (i.e names should be meaningful). Uses mixed case with a lowercase first letter. <br> Should not start with underscore _ or dollar sign $ even though it's allowed.<br>One character names should only be used for temporary variables. Use i, j, k, l, m, n for integers and c, ch, d, e for characters | int n; <br> char c, d, e; <br> double height; |
| Constants  | Contant variable names should be all uppercase with words separated by underscores | final double GRAVITY; <br> static final int CUTOFF; <br> static final int MIN_BALANCE; |

### Java Variables 

**- local -** cannot be used outside of a method, cannot be defined as `static` <br>
**- instance -** declared inside the body of a class but outside of methods, cannot be defined as `static`, since it is different for each instance (object) of the class <br>
**- static -** is associated with the class, cannot be used with objects since it is allocated memory only once <br>
