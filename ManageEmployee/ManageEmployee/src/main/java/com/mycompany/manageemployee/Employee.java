/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manageemployee;
import static com.mycompany.manageemployee.ManageEmployee.obj;
/**
 *
 * @author vygir
 */
public class Employee {
    public Employee() {
    }
    private String employeeCode;

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYears() {
        return years;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
    private String fullName;

    public Employee(String employeeCode, String fullName, int years, double coefficient, double basicSalary) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.years = years;
        this.coefficient = coefficient;
        this.basicSalary = basicSalary;
    }
    private int years;
    private double coefficient;
    private double basicSalary;
    private double salary;

    public double getSalary() {
        return coefficient*basicSalary;
    }
    public void OutputEmployee(){
        System.out.println("- Employee code: "+employeeCode+"   - Employee's full name: "+fullName+"   - Number of years of service: "+years+"   - Salary coefficient: "+coefficient+"   - Basic salary: "+basicSalary+"   - Salary: "+ salary);
    }
    public void InputEmployee(){
        System.out.print("- Employee code: ");
        employeeCode = obj.next();
        obj.nextLine();
        System.out.print("- Employee's full name: ");
        fullName = obj.nextLine();
        System.out.print("- Number of years of service: ");
        years = obj.nextInt();
        System.out.print("- Salary coefficient: ");
        coefficient = obj.nextDouble();
        System.out.print("- Basic salary: ");
        basicSalary = obj.nextDouble();
        System.out.print("- Salary: ");
        salary = coefficient*basicSalary;
    }
}
