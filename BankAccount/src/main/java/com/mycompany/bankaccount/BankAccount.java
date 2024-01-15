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
        BankAccount listAcc = new BankAccount();
        listAcc.InputAccountList();
        listAcc.print();
        ClassBankAccount person1 = new ClassBankAccount(123, "Hoang Ha", 400000);
        person1.Deposit(20000);
        person1.print();
    }
    Scanner obj = new Scanner(System.in);
    ArrayList<ClassBankAccount> accountList = new ArrayList<ClassBankAccount>();

    public BankAccount() {
    }

    public void InputAccountList() {
        int number = obj.nextInt();
        for (int i = 0; i < number; i++) {
            ClassBankAccount acc = new ClassBankAccount();
            acc.InputAccount();
            accountList.add(acc);
        }

    }

    public void print() {
        for (int i = 0; i < accountList.size(); i++) {
            accountList.get(i).print();
        }
    }

}
