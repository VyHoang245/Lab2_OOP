/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount;

import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class ClassBankAccount {
    private int accNum;
    private String name;
    private double balance;
    Scanner obj = new Scanner(System.in);
    public ClassBankAccount(){
        
    }

    public int getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public ClassBankAccount(int accNum, String name, double balance) {
        this.accNum = accNum;
        obj.nextLine();
        this.name = name;
        this.balance = balance;
    }
    public void InputAccount(){
        System.out.print("Account number: ");
        accNum = obj.nextInt();
        obj.nextLine();
        System.out.print("Custemer full name: ");
        name = obj.nextLine();
        System.out.print("Account balance: ");
        balance = obj.nextDouble();
    }
    public void Deposit(double deposit){
        balance+=deposit;
        
    }
    public boolean Withdraw(double withdraw)
    {
        if (balance>=withdraw){
            balance-=withdraw;
            return true;
        }
        return false;
    }
    public void print(){
        System.out.println("- Account number: "+accNum+"   - Custemer full name; "+name+"   - Account balance: "+ balance);
    }
    public boolean TransferMoney(ClassBankAccount a, double money){
        if(balance>=money){
            this.balance-=money;
            a.balance+=money;
            return true;
        }
        return false;
    }    
    
}
