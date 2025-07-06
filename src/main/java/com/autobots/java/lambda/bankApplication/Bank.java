package com.autobots.java.lambda.bankApplication;

public interface Bank {

    double getBalance();
    void deposit(double amount);
    void withDraw(double amount);

    static void transverFunds(Bank sender, Bank recipient, double transverAmount){
        sender.withDraw(transverAmount);
        recipient.deposit(transverAmount);
    }
}
