package com.autobots.java.lambda.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {


        MBank aliiaMBank = new MBank(123456789012L, 444444444 );
     //   System.out.println(aliiaMBank.getBalance());
        aliiaMBank.deposit(100000);
        System.out.println("______________");
     //   System.out.println(aliiaMBank.getBalance());

        OptimaBank ulugbekOptima = new OptimaBank(123456789123L, 666666665);
     //   System.out.println(ulugbekOptima.getBalance());

        Bank.transverFunds(aliiaMBank, ulugbekOptima,500);
     //   System.out.println(aliiaMBank.getBalance());
     //   System.out.println(ulugbekOptima.getBalance());

        DemirBank zinaidaDemir = new DemirBank(123456789456L,
                666666666);

 //       Bank.transverFunds(zinaidaDemir, ulugbekOptima, 1000);

//        zinaidaDemir.deposit(600000);
 //       zinaidaDemir.withDraw(500000);
        System.out.println(zinaidaDemir.getBalance());


        BankBase.allBankRecords.stream().filter((n -> n.getBalance() > 100)).forEach(System.out::println);
        System.out.println("--------");
        double allSumBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumBanks);


    }

}
