/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manageemployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class ManageEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Input(employees);
        Sort(employees);
        FindMax(employees);
        Print(employees);
    }

    public ManageEmployee() {
    }
    static Scanner obj = new Scanner(System.in);
    public static void Input(ArrayList<Employee> employees){
        int number = obj.nextInt();
        for(int i=0; i<number;i++){
            Employee e = new Employee();
            e.InputEmployee();
            employees.add(e);
        }
    }
    public static void Sort(ArrayList<Employee> employees){
        Comparator<Employee> com = new Comparator<Employee>(){
            public int compare(Employee e1, Employee e2){
                return (int) (e2.getSalary() - e1.getSalary());
            }
        };
        employees.sort(com);
        
    }
    public static void FindMax(ArrayList<Employee> employees){
        double max = employees.get(0).getSalary();
        System.out.println("The employees with the highest salary: ");
        for(int i = 0; i<employees.size();i++){
            if(employees.get(i).getSalary()==max){
                System.out.println("- Employee code: "+employees.get(i).getEmployeeCode()+" - Employee's full name: "+employees.get(i).getFullName()+" - Salary: "+employees.get(i).getSalary());
            }
        }
    }
    public static void Print(ArrayList<Employee> employees){
        for(int i = 0; i<employees.size();i++){
            employees.get(i).OutputEmployee();
        }
    }
}
