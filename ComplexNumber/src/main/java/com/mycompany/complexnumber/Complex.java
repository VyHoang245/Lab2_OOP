/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumber;

import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex() {
    }

    public void Input(){
         Scanner sc=new Scanner(System.in);
         System.out.println("The real part:");
         real=sc.nextDouble();
         System.out.println("The imaginary part:");
         imaginary=sc.nextDouble();
    }
    public void Print(){
        System.out.println(real+"+"+imaginary+"i");
    }

    
    
}
