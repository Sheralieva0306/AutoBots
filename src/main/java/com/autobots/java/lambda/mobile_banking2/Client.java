package com.autobots.java.lambda.mobile_banking2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {

    private String fullname;
    private UUID clientID = UUID.randomUUID();
    private int pinCode;
    private boolean isAuthorised = false;
  //  protected static List<BankAccount> listOfBankAccounts;

    public Client(String fullname, int pinCode) {
        this.fullname = fullname;
        this.pinCode = pinCode;
  //      listOfBankAccounts = new ArrayList<>();
    }

}
