package com.bvr.behavioral.memento;

public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public Memento deposit(int amount){
        balance += amount;
        return new Memento(balance);
    }

    public void restore(Memento memento){
        balance = memento.balance;
    }

    public String toString(){
        return "BankAccount{balance=" + balance + "}";
    }
}
