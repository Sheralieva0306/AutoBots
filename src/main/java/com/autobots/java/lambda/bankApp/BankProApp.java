package com.autobots.java.lambda.bankApp;

import java.util.HashMap;
import java.util.Map;

public class BankProApp {

    private static final Map<String, Client> clients = new HashMap<>();

    public static void main(String[] args) {

        Client asan = new Client("Asan Uson", "123");
        Client ulan = new Client("Djunushov Ulan", "1234");

        DepositAccount asandepositAccount = new DepositAccount(asan, Currency.USD);
        CreditAccount asanCreditAccount = new CreditAccount(asan, Currency.EUR);
//        DepositAccount ulanDepositAccount = new DepositAccount(ulan,Currency.EUR);
//        CreditAccount ulanCreditAccount = new CreditAccount(ulan, Currency.USD);
//
         asan.addAccount(asandepositAccount);
        System.out.println(asanCreditAccount.getCurrency());
        asan.addAccount(asanCreditAccount);
//        ulan.addAccount(ulanDepositAccount);
//        ulan.addAccount(ulanCreditAccount);
//
//        clients.put(asan.getClientID(), asan);
//        clients.put(ulan.getClientID(),ulan);




    }
}
