/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathlibraryapp;

/**
 *
 * @author Student
 */
    public class NumberAnalysisModule extends MathOperation {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public long factorial(int n) {
        if (n < 0) return 0;
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

}

