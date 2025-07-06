package com.autobots.java.lambda.bankApplication;

public class MBank extends BankBase{

    private double balance = 200;

    public MBank(long accountNymber, long routingNumber) throws Exception {
        super(accountNymber, routingNumber);
        addToAllBankRecords(this);// this - это ссылка на текущий объект, который создается в конструкторе
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount >= 200000){
            throw new IllegalArgumentException("Invalid amount. Can not be deposit");
        }
        balance += amount;


    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 150000){
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
