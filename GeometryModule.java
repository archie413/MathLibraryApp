/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathlibraryapp;

/**
 *
 * @author Student
 */
    public class GeometryModule extends MathOperation {

    public String calculateCircleArea(double radius) {
        if (radius < 0) return "Error: Radius cannot be negative.";
        setInputs(radius, 0); 
        double area = Math.PI * Math.pow(getVal1(), 2);
        return String.format("%.2f", area);
    }

    public double calculateRectangleArea(double length, double width) {
        setInputs(length, width);
        return getVal1() * getVal2();
    }
}

    
    

    


