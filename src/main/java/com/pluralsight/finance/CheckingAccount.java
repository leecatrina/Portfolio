package com.pluralsight.finance;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public double getValue() {
        return getBalance();
    }

    public double deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        return newBalance;
    }

    public double withdraw(double amount) {
        double newBalance = getBalance() - amount;
        setBalance(newBalance);
        return newBalance;
    }
}
