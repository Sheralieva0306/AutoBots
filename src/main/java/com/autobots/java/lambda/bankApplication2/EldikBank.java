package com.autobots.java.lambda.bankApplication2;

public class EldikBank extends BankBase2{

    private  double balance = 500;

    public EldikBank(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
        addToAllBankRecords(this);
    }


    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount >= 250000){
            throw new IllegalArgumentException("Invalid amount. can not be deposit.");
        }
        balance += amount;

    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 200000){
            throw  new IllegalArgumentException("Invalid amount can not be withDraw.");
        }else {
            if (amount > balance){
                throw new IllegalArgumentException("Insufficient funds");
            }else{
                balance -= amount;
            }
        }
    }
}
