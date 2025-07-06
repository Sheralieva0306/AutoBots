package com.autobots.java.lambda.bankApplication2;

public class AiylBank extends BankBase2{

    private double balance = 200;

    public AiylBank(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
        addToAllBankRecords(this);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount >= 200000 ){
            throw new IllegalArgumentException("Invalid amount.Can not be deposit.");

        }
        balance += amount;

    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 150000){
            throw new IllegalArgumentException("Invalid amount. Can not be withDraw");
        }else {
            if (amount > balance){
                throw new IllegalArgumentException("Insufficient funds");

            }else {
                balance -= amount;
            }

        }

    }
}
