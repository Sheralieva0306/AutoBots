package com.autobots.java.lambda.bankApplication2;

public interface Bank2 {

    String BANK_TYPE = "National";

    double getBalance();
    void deposit(double amount);
    void withDraw(double amount);

    static void transverFunds(Bank2 sender,Bank2 recipient, double transverAmount){

        sender.withDraw(transverAmount);
        recipient.deposit(transverAmount);

    }

}
