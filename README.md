# MathLibraryApp
This is a simple Java console application I created to practice Object-Oriented Programming (OOP). It functions like a modular calculator where you can perform different types of mathematical operations.

What does it do?
When you run the app, it opens a menu where you can choose a specific math module. It takes user input using the Scanner class and returns the result.

The modules include:
Arithmetic: basic addition and division (handles division by zero!).

Geometry: Calculates the area of a circle.

Number Analysis: Checks if a number is Prime and calculates Factorials.

Trigonometry: Calculates Sine and Cosine for a given angle (in degrees).

How it works (OOP Concepts)?
I used this project to learn about Inheritance and Encapsulation.

The Mother Class (MathOperation): This is the parent class. It holds the private variables (val1, val2) and handles the setters and getters.

The Subclasses: Classes like ArithmeticModule and GeometryModule extend the mother class. They inherit the variables but define their own specific logic (like formulas for area or checking primes).

How to Run?
1) Clone this repository or download the files.
2) Open the project in your IDE (like NetBeans, IntelliJ, or VS Code).
3) Run the MathLibraryApp.java file.
4) Follow the instructions in the console!

Project Structure
MathLibraryApp.java -> The Main class (contains the menu loop).

MathOperation.java -> The Parent class.

ArithmeticModule.java -> Child class for basic math.

GeometryModule.java -> Child class for shapes.

NumberAnalysisModule.java -> Child class for logic checks.

TrigonometryModule.java -> Child class for angles.
