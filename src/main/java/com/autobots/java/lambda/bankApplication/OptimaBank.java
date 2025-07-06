package com.autobots.java.lambda.bankApplication;

import static com.autobots.java.lambda.bankApplication.BankBase.addToAllBankRecords;

public class OptimaBank extends BankBase {

    private double balance = 0;

    public OptimaBank(long accountNymber, long routingNumber) throws Exception {
        super(accountNymber, routingNumber);
        addToAllBankRecords(this);
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount >= 300000){
            throw new IllegalArgumentException("Invalid amount. Can not be deposit");
        }
        balance += amount;


    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 250000){
            throw new IllegalArgumentException("Invalid amount.Can not be withDraw");

        }else {
            if (amount > balance){
                throw new IllegalArgumentException("Insufficient funds");
            }else {
                balance -= amount;
            }
        }

    }
}
