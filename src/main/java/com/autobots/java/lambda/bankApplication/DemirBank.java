package com.autobots.java.lambda.bankApplication;

public class DemirBank extends BankBase {
    private double balance = 500;

    public DemirBank(long accountNymber, long routingNumber) throws Exception {
        super(accountNymber, routingNumber);
        addToAllBankRecords(this);
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount >= 500000){
            throw new IllegalArgumentException("Invalid amount. Can not be deposit");
        }
        balance += amount;


    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 450000){
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
