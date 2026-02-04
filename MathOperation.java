/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathlibraryapp;

/**
 *
 * @author Student
 */
   public class MathOperation {
    // Encapsulation: Private attributes
    private double val1;
    private double val2;

    // Constructor
    public MathOperation() {
        this.val1 = 0;
        this.val2 = 0;
    }

    // Setters with basic validation
    public void setInputs(double v1, double v2) {
        this.val1 = v1;
        this.val2 = v2;
    }

    // Getters
    protected double getVal1() { return val1; }
    protected double getVal2() { return val2; }
} 

