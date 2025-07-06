package com.autobots.java.lambda.mobileBanking;

public interface Bank {

    double getBalance();
    void deposit(double amount);
    void withDraw(double amount);

    static void transferFunds(Bank sender, Bank recipient, double tranferamount){
        sender.withDraw(tranferamount);
        recipient.deposit(tranferamount);
    }
}
