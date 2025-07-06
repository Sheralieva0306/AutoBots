package com.autobots.java.lambda.mobileBanking;

import java.util.HashSet;
import java.util.Set;

public class MBank extends BankBase {


    private double balance = 200;
    public static Set<BankBase> recordsOfOptima = new HashSet<>();

    public MBank(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
        addToRecords(this);
        allBankUserCount.put(this.getBankName(), allBankUserCount.getOrDefault(this.getBankName(), 0) + 1);
    }

    public void addToRecords(BankBase bank) throws Exception {
        for (BankBase bankBase : recordsOfOptima) {
            if (bankBase.getAccountNumber() == bank.getRoutingNumber()) {
                throw new Exception(bank.getAccountNumber() + ": account number already exist");
            }
            if (bankBase.getRoutingNumber() == bank.getRoutingNumber()) {
                throw new Exception(bank.getRoutingNumber() + ": routing number already exist");
            }
        }
        recordsOfOptima.add(bank);
    }

    public static void printAllRecords() {
        System.out.println("MBank: ");
        for (BankBase bank1 : recordsOfOptima) {
            System.out.println("Account number: " + bank1.getAccountNumber() + "\nRouting  number: " + bank1.getRoutingNumber());
        }
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount > 200000) {
            throw new IllegalArgumentException("Invalid amount. Cfn not be deposit");
        } else {
            balance += amount;
        }

    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount > 150000) {
            throw new IllegalArgumentException("Invalid amount. Can not be withDraw");
        } else {
            if (balance < amount) {
                throw new IllegalArgumentException("Insufficient funds");
            } else {
                balance -= amount;
            }
        }
    }
}