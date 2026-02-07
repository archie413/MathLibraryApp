/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathlibraryapp;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class MathLibraryApp {

    /**
     * 
     * 
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean active = true;

        // Object Instantiation
        ArithmeticModule arithmetic = new ArithmeticModule();
        GeometryModule geometry = new GeometryModule();
        NumberAnalysisModule analysis = new NumberAnalysisModule();
        TrigonometryModule trig = new TrigonometryModule();

        System.out.println("Math Library App\n");

        while (active) {
            System.out.print("\nSelect Module:\n");
            System.out.println("1. Arithmetic");
            System.out.println("2. Geometry");
            System.out.println("3. Analysis");
            System.out.println("4. Trigonometry");
            System.out.println("5. Exit");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    arithmetic.setInputs(sc.nextDouble(), sc.nextDouble());
                    System.out.println("Sum: " + arithmetic.add());
                    System.out.println("Difference: " + arithmetic.subtract());
                    System.out.println("Multiply: " + arithmetic.multiply());
                    System.out.println("Div: " + arithmetic.divide());
                    break;
                case 2:
                    System.out.print("Enter Circle Radius: ");
                    System.out.println("Area: " + geometry.calculateCircleArea(sc.nextDouble()));
                    break;
                case 3:
                    System.out.print("Enter Number: ");
                    int num = sc.nextInt();
                    System.out.println("Prime: " + analysis.isPrime(num));
                    System.out.println("Factorial: " + analysis.factorial(num));
                    break;
                case 4:
                    System.out.print("Enter Angle (Degrees): ");
                    trig.setInputs(sc.nextDouble(), 0);
                    System.out.printf("Sine: %.4f\nCosine: %.4f\n", trig.getSine(), trig.getCosine());
                    break;
                case 5:
                    active = false;
                    System.out.println("System Closed.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }

}
