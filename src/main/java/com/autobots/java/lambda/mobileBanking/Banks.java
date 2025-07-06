package com.autobots.java.lambda.mobileBanking;

public enum Banks  implements Bank{
    MBANK("MBank"),
    OPTIMABANK("Optima Bank"),
    DEMIRBANK("Demir Bank"),
    OBANK("O Bank"),
    ;

    private final String description;

    Banks (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withDraw(double amount) {

    }
}
