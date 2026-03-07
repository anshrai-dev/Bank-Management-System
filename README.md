# 🏦 Java Banking System (Core Java Project)

A **console-based banking application built using Core Java** designed to practice **Object-Oriented Programming concepts** and simulate real-world banking operations.

This project is developed **incrementally through multiple versions** to demonstrate progressive improvements in **logic building, code structure, input validation, and software design**.

Each version introduces new features or structural improvements to make the application **more reliable, maintainable, and closer to a real-world system**.

---

# 🚀 Current Version

## Version 3 – Input Validation and Data Integrity

The project currently implements a **menu-driven banking system capable of managing multiple accounts and performing core banking transactions**.

In **Version 3**, the primary focus was on improving **system reliability and data integrity** by introducing **input validations and safeguards against invalid operations**.

These improvements ensure that users cannot perform operations that would lead to **inconsistent or invalid account data**.

### Key Improvements Introduced in Version 3

- Implemented **10-digit account number validation**
- Added **duplicate account number prevention**
- Added validation to prevent **invalid deposit amounts**
- Added validation to prevent **withdrawal amounts greater than the available balance**
- Implemented **menu choice validation** to prevent invalid menu selections
- Improved account lookup using **`.equals()`** for correct String comparison
- Strengthened the program logic to ensure **safe and predictable user operations**

These enhancements make the application **significantly more robust and reliable compared to earlier versions**.

---

# 📌 Project Features

The system currently supports the following banking operations:

- Create a **new bank account**
- Deposit money into an account
- Withdraw money from an account
- Check current account balance
- View account details
- Manage **multiple accounts** within the system
- Menu-driven **console interface**
- Input validation to prevent incorrect operations

The application simulates **basic real-world banking functionality within a console environment**.

---

# ☕ Java Concepts Used

This project demonstrates several **important Core Java concepts** used in real-world applications.

## Object-Oriented Programming Concepts

- Classes and Objects
- Constructors
- Encapsulation
- Instance Variables
- Static Variables

## Core Programming Concepts

- Methods
- Method Returning Values
- Arrays of Objects
- Conditional Statements (`if-else`, `switch`)
- Looping (`for loop`, `do-while`)
- String comparison using `.equals()`

## Input and Interaction

- `Scanner` class for dynamic user input
- Menu-driven program design
- Input validation techniques

## Code Quality Improvements

- Code Refactoring
- Reusable methods
- Improved readability and maintainability

---

# 📂 Project Structure


com.bank.app
│
├── Bank.java
└── Main.java


---

## 📄 Bank.java

This class represents a **bank account entity** and is responsible for handling all account-related operations.

### Responsibilities

- Storing account holder details
- Managing account balance
- Handling deposit operations
- Handling withdrawal operations
- Displaying account balance
- Displaying account information

The class also demonstrates **encapsulation and proper method usage** for handling financial operations.

---

## 📄 Main.java

This class contains the **main application logic** and acts as the entry point of the program.

### Responsibilities

- Implementing the **menu-driven console interface**
- Creating and storing bank accounts
- Searching for accounts within the system
- Managing user transactions such as deposits and withdrawals
- Handling user input and performing validations
- Coordinating interactions between the user and the `Bank` class

---

# 📜 Version History

---

## Version 1 – Basic Banking System

This was the **initial implementation of the banking application**.

The goal of Version 1 was to create a **simple system capable of performing basic banking operations**.

### Features Implemented

- Create a bank account
- Deposit money
- Withdraw money
- Check account balance
- Display account details
- Menu-driven console interface

### Concepts Practiced

- Classes and Objects
- Constructors
- Basic conditional logic
- Scanner for user input
- Simple method implementation

---

## Version 2 – Code Refactoring and Improved Structure

Version 2 focused on **improving the internal structure of the program and reducing code duplication**.

The major improvement was the introduction of a **reusable method to locate bank accounts**.

### Improvements Introduced

- Implemented `findAccount()` method to search accounts efficiently
- Removed repeated loops across different cases
- Added **Account Not Found validation**
- Improved code readability
- Improved modularity and maintainability of the application

These changes made the code **cleaner, more reusable, and easier to maintain**.

---

## Version 3 – Input Validation and Data Integrity (Current Version)

Version 3 introduces **stronger validation and safeguards** to prevent invalid operations and improve the reliability of the system.

### Enhancements Added

- Account number validation (**must be 10 digits**)
- Duplicate account number prevention
- Deposit amount validation
- Withdrawal validation based on available balance
- Menu option validation
- Improved string comparison logic

These improvements ensure that the system behaves more like a **real-world banking application with controlled inputs and safe transactions**.

---

# 🔮 Future Improvements

The project will continue to evolve with additional improvements in upcoming versions.

---

## Version 4 – Exception Handling

Planned improvements:

- Introduce **exception handling (`try-catch`)**
- Handle invalid numeric inputs safely
- Prevent application crashes due to incorrect user input
- Improve program stability

---

## Version 5 – Transaction History

Planned improvements:

- Maintain a **history of account transactions**
- Display previous deposits and withdrawals
- Improve account transparency

---

## Version 6 – Scalable Account Storage

Planned improvements:

- Replace fixed-size arrays with **`ArrayList`**
- Allow unlimited account creation
- Improve scalability of the application

---

## Version 7 – Data Persistence

Planned improvements:

- Implement **file handling**
- Store account information in files
- Maintain data even after application restart

---

# 🛠 Technologies Used

- **Java (Core Java)**
- **Eclipse IDE**
- **Git**
- **GitHub**

---

# 👨‍💻 Author

Developed by **Ansh Rai** while learning **Core Java, Object-Oriented Programming, and Git version control**.

The purpose of this project is to **build strong fundamentals in Java programming while following a version-based development approach similar to real-world software projects**.