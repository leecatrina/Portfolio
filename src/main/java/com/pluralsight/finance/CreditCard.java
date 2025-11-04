package com.pluralsight.finance;

public class CreditCard extends Account {
    public CreditCard(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public CreditCard(String name, int accountNumber, int balance) {
        super();
    }

    public  double charge(double amount){
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        return newBalance;
    }
    public double pay(double amount){
        double newBalance = getBalance() - amount;
        setBalance(newBalance);
        return newBalance;
    }

    @Override
    public double getValue() {
        return getBalance();
    }
}
