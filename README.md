Employee Management (OOP Practice in Java)

This project is a simple Object-Oriented Programming (OOP) practice application in Java.
It demonstrates the use of abstract classes, inheritance, interfaces, method overriding, and polymorphism through an Employee Management system.

📌 Features

Abstract Class (Employee)
Defines common attributes (name, SSN) and declares the abstract method Earning().

Interface (Displayable)
Requires implementing classes to provide:

displayAllDetails()

displayEarning()

Employee Types

SalariedEmployee → Salary, bonus, deduction

HourlyEmployee → Hourly rate × number of hours

CommissionEmployee → Gross sales × commission rate

BasePlusCommissionEmployee → Commission earnings + base salary

Polymorphism in Action
Each employee type provides its own implementation of Earning() and display methods.

🏗️ Project Structure
src/
├── Employee.java                  # Abstract Employee class
├── Displayable.java                # Interface
├── SalariedEmployee.java           # Salaried employee implementation
├── HourlyEmployee.java             # Hourly employee implementation
├── CommissionEmployee.java         # Commission-based employee
├── BasePlusCommissionEmployee.java # Commission + base salary
└── Main.java                       # Demo class

🚀 How to Run

Clone the repository:

git clone https://github.com/your-username/employee-oop-practice.git
cd employee-oop-practice


Compile the Java files:

javac Main.java


Run the program:

java Main

🖥️ Example Output
CommissionEmployee Info:
Name: Abdullah
SSN: 2323423
Gross Sales: 3242.0
Commission: 0.15
Earning: 486.3

BasePlusCommissionEmployee Info:
Name: Sayed
SSN: 2321232
Gross Sales: 5000.0
Commission: 0.5
Base: 3000.0
Earning: 5500.0
...

🎯 Learning Objectives

This project helps beginners practice:

Abstract classes & interfaces

Inheritance & method overriding

Encapsulation with getters/setters

Polymorphism through multiple employee types

Writing clean, modular Java code

📖 Future Enhancements

Add user input for creating employees dynamically

Store employee data in a list or database

Build a simple GUI or web interface

👨‍💻 Author

Abdullah Mohamed
Practice project for Introductory OOP Course
