/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathlibraryapp;

/**
 *
 * @author Student
 */
    public class TrigonometryModule extends MathOperation {
    // val1 represents the angle in degrees
    
    public double getSine() {
        return Math.sin(Math.toRadians(getVal1()));
    }

    public double getCosine() {
        return Math.cos(Math.toRadians(getVal1()));
    }

    public double getTangent() {
        return Math.tan(Math.toRadians(getVal1()));
    }

}
