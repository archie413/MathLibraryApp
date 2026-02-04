/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathlibraryapp;

/**
 *
 * @author Student
 */
    public class ArithmeticModule extends MathOperation {
    
    public double add() { return getVal1() + getVal2(); }
    public double subtract() { return getVal1() - getVal2(); }
    public double multiply() { return getVal1() * getVal2(); }
    
    public String divide() {
        if (getVal2() == 0) return "Error: Division by Zero";
        return String.valueOf(getVal1() / getVal2());
    }
    
}


