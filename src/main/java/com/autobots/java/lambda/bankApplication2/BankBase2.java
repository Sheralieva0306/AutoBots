package com.autobots.java.lambda.bankApplication2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class BankBase2 implements Bank2{

    private String bankName;
    private long accountNumber;
    private long routingNumber;

    public static Set<BankBase2> allBankRecords = new HashSet<>();

    public BankBase2(String bankName, long accountNumber, long routingNumber) {
        this.bankName = bankName;
        if (Long.toString(accountNumber).length() != 12){
            throw new IllegalArgumentException("Account number must be 12 digits");
        } else if (Long.toString(routingNumber).length() != 9) {
            throw new IllegalArgumentException("Routing number must be 9 digits");
        }else {
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;
        }
    }

    public static void addToAllBankRecords(BankBase2 bank2) throws Exception {
        for (BankBase2 bankBase2 : allBankRecords){
            if (bankBase2.getAccountNumber() == bank2.getAccountNumber()){
                throw new Exception(bank2.getAccountNumber() + ": account number already exist");
            }
            if (bankBase2.getRoutingNumber() == bank2.getRoutingNumber()){
                throw new Exception(bank2.getRoutingNumber() + ": routing number already exist");
            }
        }
        allBankRecords.add(bank2);


    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankBase2 bankBase2 = (BankBase2) o;
        return accountNumber == bankBase2.accountNumber && routingNumber == bankBase2.routingNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, routingNumber);
    }

    @Override
    public String toString() {
        return "BankBase2{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber=" + accountNumber +
                ", routingNumber=" + routingNumber +
                '}';
    }
}
