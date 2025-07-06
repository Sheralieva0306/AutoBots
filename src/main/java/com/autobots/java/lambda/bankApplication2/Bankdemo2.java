package com.autobots.java.lambda.bankApplication2;

public class Bankdemo2 {
    public static void main(String[] args) throws Exception {

        AiylBank jainagul = new AiylBank("Aiyl Bank", 123456789111L, 123456789);
        BakaiBank ulan = new BakaiBank("Bakai Bank",123456789222L, 123456987);
        EldikBank ailin = new EldikBank("Eldik Bank",123456987654L, 123456788);
        System.out.println(jainagul.getBankName());
        System.out.println(Bank2.BANK_TYPE);
        jainagul.deposit(5000);
        ulan.deposit(100000);
        Bank2.transverFunds(ulan, jainagul, 50000);

        System.out.println(ulan.getBalance());
        System.out.println(ulan.getBankName());
        jainagul.withDraw(45000);
        System.out.println(jainagul.getBalance());




    }




}
