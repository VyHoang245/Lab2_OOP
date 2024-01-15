/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bankaccount;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class BankAccount {

    public static void main(String[] args) {
        ArrayList<ClassBankAccount> accountList = new ArrayList<ClassBankAccount>();
        InputAccountList(accountList);
        print(accountList);
        ClassBankAccount person1 = new ClassBankAccount(123, "Hoang Ha", 400000);
        person1.Deposit(20000);
        person1.print();
        
    }
    static Scanner obj = new Scanner(System.in);
    

    public BankAccount() {
    }

    public static void InputAccountList( ArrayList<ClassBankAccount> accountList) {
        int number = obj.nextInt();
        for (int i = 0; i < number; i++) {
            ClassBankAccount acc = new ClassBankAccount();
            acc.InputAccount();
            accountList.add(acc);
        }

    }

    public static void print(ArrayList<ClassBankAccount> accountList) {
        for (int i = 0; i < accountList.size(); i++) {
            accountList.get(i).print();
        }
    }

}
