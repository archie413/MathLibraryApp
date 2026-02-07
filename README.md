MathLibraryApp
1. Class Responsibilities
Each class in the application serves a distinct purpose to separate the user interface from the mathematical logic.

MathLibraryApp (Main Class)

Role: Acts as the entry point and User Interface (CLI).

Responsibilities: Handles user input via Scanner, manages the menu loop, and delegates tasks to the specific module objects based on the user's choice.

>MathOperation (Parent Class)

Role: The foundation for all mathematical modules.

Responsibilities: Manages the shared state (the operands val1 and val2) and provides a standardized way to set and retrieve these values.

>ArithmeticModule

Role: Basic calculation logic.

Responsibilities: Performs addition, subtraction, multiplication, and division using the operands stored in the parent class. Includes error handling for division by zero.

>GeometryModule

Role: Spatial calculation logic.

Responsibilities: Calculates areas for shapes. It reuses the parent's input fields to store dimensions (e.g., using val1 for radius or length).

>NumberAnalysisModule

Role: Integer property logic.

Responsibilities: Determines if a number is prime and calculates factorials. Note: While it inherits from MathOperation, its methods currently accept direct arguments.

>TrigonometryModule

Role: Angle calculation logic.

Responsibilities: Converts degrees to radians and calculates Sine, Cosine, and Tangent using the angle stored in val1.

2. Inheritance Structure
The application utilizes Hierarchical Inheritance, where multiple subclasses inherit from a single superclass. This promotes code reusability by centralizing the storage of input values.

Hierarchy Diagram
Code snippet
graph TD;
    MathOperation-->ArithmeticModule;
    MathOperation-->GeometryModule;
    MathOperation-->NumberAnalysisModule;
    MathOperation-->TrigonometryModule;
Superclass: MathOperation

Subclasses: ArithmeticModule, GeometryModule, NumberAnalysisModule, TrigonometryModule

The subclasses extend MathOperation to gain access to the val1 and val2 attributes and the helper methods (setInputs, getVal1, getVal2) without needing to redeclare them.

3. How Encapsulation was Applied
Encapsulation is used to protect the data and control how other classes access it. This is achieved through Access Modifiers:

Private Attributes (private):

In MathOperation, the fields val1 and val2 are marked as private.

Benefit: This hides the internal state from the Main class and the outside world, preventing direct or accidental modification.

Protected Getters (protected):

The methods getVal1() and getVal2() are marked as protected.

Benefit: This grants access only to the subclasses (like ArithmeticModule) and classes in the same package, keeping the raw data hidden from unrelated external classes.

Public Setters & Logic (public):

Methods like setInputs() and the calculation methods (e.g., add(), calculateCircleArea()) are public.

Benefit: This provides a controlled interface for the MathLibraryApp to interact with the objects. The setters also include validation logic (e.g., ensuring inputs are valid doubles) before saving data.

Example Flow:
User enters input in MathLibraryApp.

App calls public setInputs().

Parent saves data into private val1.

Subclass calls protected getVal1() to perform math.

Subclass returns result via public method.
