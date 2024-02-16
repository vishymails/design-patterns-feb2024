package com.bvr.behavioral.memento;

public class MementoTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        Memento memento1 = bankAccount.deposit(50);
        Memento memento2 = bankAccount.deposit(125);
        Memento memento3 = bankAccount.deposit(325);

        System.out.println(bankAccount);


        bankAccount.restore(memento1);
        System.out.println(bankAccount);


        bankAccount.restore(memento2);
        System.out.println(bankAccount);

        bankAccount.restore(memento3);
        System.out.println(bankAccount);
    }
}
