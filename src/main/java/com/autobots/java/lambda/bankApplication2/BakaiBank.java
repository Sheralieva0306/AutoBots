package com.autobots.java.lambda.bankApplication2;

public class BakaiBank extends BankBase2{

    private double balance;

    public BakaiBank(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
        addToAllBankRecords(this);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount >= 300000){
            throw  new IllegalArgumentException("Invalid amount. Can not be deposit.");
        }
        balance += amount;

    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 350000){
            throw  new IllegalArgumentException("Invalid amount. Can not deposit.");
        }else{
            if (amount > balance){
                throw new IllegalArgumentException("Insufficient amount.");
                }else{
                balance -= amount;

                }
            }
        }

    }

