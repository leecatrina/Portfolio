package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Catrina's Checking", "341324", 12334);
        CreditCard creditCard = new CreditCard("Catrina's Credit Card", 4324325, 1000);
        Gold gold = new Gold("Gold watch", 16000, 20);

        Portfolio portfolio = new Portfolio("Catrina's Aasets","Catrina");
        portfolio.add(checkingAccount);
        portfolio.add(Gold);
        portfolio.add(creditCard);
        System.out.println(portfolio.getValue());
    }
}
