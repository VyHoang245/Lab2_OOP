/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.complexnumber;

/**
 *
 * @author vygir
 */
public class ComplexNumber {

    public static void main(String[] args) {
        Complex number1 = new Complex(1, 2);
        Complex number2 = new Complex(3, 4);
        Addition(number1, number2).Print();
        Plus(number1, number2).Print();

    }

    public static Complex Addition(Complex number1, Complex number2) {
        double r = number1.getReal() + number2.getReal();
        double i = number1.getImaginary() + number2.getImaginary();
        Complex sum = new Complex(r, i);
        return sum;
    }

    public static Complex Plus(Complex number1, Complex number2) {
        double r = number1.getReal() * number2.getReal() - number1.getImaginary() * number2.getImaginary();
        double i = number1.getReal() * number2.getImaginary() + number2.getReal() * number1.getImaginary();
        Complex result = new Complex(r, i);
        return result;
    }

    public static Complex Minus(Complex number1, Complex number2) {
        double r = number1.getReal() - number2.getReal();
        double i = number1.getImaginary() - number2.getImaginary();
        Complex result = new Complex(r, i);
        return result;

    }
    public static Complex Division(Complex number1, Complex number2) {
        double r = (number1.getReal()*number2.getReal())+(number1.getImaginary()*number2.getImaginary())/((number2.getReal()*number2.getReal())+(number2.getImaginary()*number2.getImaginary())) ;
        double i = (number1.getImaginary()*number2.getReal())-(number1.getReal()*number2.getImaginary())/(number2.getReal()*number2.getReal())+(number2.getImaginary()*number2.getImaginary());
        Complex result = new Complex(r, i);
        return result;
    }
}
