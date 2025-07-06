package com.autobots.java.lambda.bankApplication;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class BankBase implements Bank {

    private  String bankName;
    private long accountNumber;
    private  long routingNumber;

    public static Set<BankBase> allBankRecords = new HashSet<>();
    // создать отдельную базу для разных банков
    // в allBankRecords создать базу данных всех банков по отдельности


    public BankBase(long accountNumber, long routingNumber) {
        if(Long.toString(accountNumber).length() != 12) {
            throw new IllegalArgumentException("Account number must be 12 digits");
        } else if (Long.toString(routingNumber).length() != 9) {
            throw new IllegalArgumentException("Routing number must be 9 digits");
        } else {
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;
        }


    }

    public static void addToAllBankRecords(BankBase bank) throws Exception{
        for (BankBase bankBase : allBankRecords){
            if (bankBase.getAccountNymber() == bank.getAccountNymber()){
                throw  new Exception(bank.getAccountNymber() + ": account number already exist");
            }
            if (bankBase.getRoutingNumber() == bank.getRoutingNumber()){
                throw new Exception(bank.getRoutingNumber() + " : routing number already exist");
            }
        }
        allBankRecords.add(bank);
    }

    public long getAccountNymber() {
        return accountNumber;
    }

    public void setAccountNymber(long accountNymber) {
        this.accountNumber = accountNymber;
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
        BankBase bankBase = (BankBase) o;
        return accountNumber == bankBase.accountNumber && routingNumber == bankBase.routingNumber;
    }
    // Объекты считаются равными, если совпадает accountNumber и routingNumber

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, routingNumber);
        // хеш-код вычисляется по значениям accountNumber и  routingNumber
    }


    @Override
    public String toString() {
        return "BankBase{" +
                "accountNymber=" + accountNumber +
                ", routingNumber=" + routingNumber +
                '}';
    }
}
