# Java Banking System (Core Java Project)

A **console-based banking application built using Core Java** to practice object-oriented programming concepts and real-world logic building.

This project is developed **version by version** to demonstrate progressive improvements in code structure, logic, and software design.

---

# Current Version

## Version 2 – Code Refactoring and Improved Structure

The project currently implements a **menu-driven banking system** where users can create accounts and perform transactions.

In Version 2 the code was **refactored to improve maintainability** by introducing a reusable method for searching bank accounts.

Key Improvements:
- Introduced `findAccount()` method to locate accounts
- Removed repeated loops from multiple cases
- Added **Account Not Found** validation
- Cleaner and more modular code structure
- Improved readability and maintainability

---

# Project Features

- Create Bank Account
- Deposit Money
- Withdraw Money
- Check Account Balance
- View Account Details
- Menu-driven console interface

---

# Java Concepts Used

This project demonstrates the following **Core Java concepts**:

- Classes and Objects
- Constructors
- Encapsulation
- Static Variables
- Methods
- Arrays of Objects
- Method Returning Values
- Loops (for loop)
- Conditional Statements (if-else, switch)
- Scanner for dynamic input
- Code Refactoring

---

# Project Structure

```
com.bank.app
│
├── Bank.java
└── Main.java
```

### Bank.java
Handles:
- Account holder details
- Deposit operation
- Withdraw operation
- Display balance
- Display account details

### Main.java
Handles:
- Menu-driven system
- Account creation
- Account searching
- Transaction operations

---

# Version History

### Version 1 – Basic Banking System
Initial implementation of the banking system.

Features:
- Account creation
- Deposit
- Withdraw
- Balance check
- Account details
- Menu-driven console application

---

### Version 2 – Code Refactoring
Improved program structure.

Changes:
- Created `findAccount()` reusable method
- Removed duplicate loops
- Added account validation during operations
- Cleaner code organization

---

# Future Improvements

### Version 3
- Account number validation (6 digits)
- Prevent duplicate accounts
- Prevent invalid deposits/withdrawals
- Improved input validation

### Version 4
- Introduce service layer for better architecture

### Version 5
- File handling to store account data

### Version 6
- Replace arrays with `ArrayList` for scalability

---

# Technologies Used

- Java
- Eclipse IDE
- Git
- GitHub

---

# Author

Developed by **Ansh Rai** while learning **Core Java and Git workflow**.