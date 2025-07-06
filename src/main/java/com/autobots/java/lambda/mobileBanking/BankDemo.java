package com.autobots.java.lambda.mobileBanking;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        MBank aliiaMBank = new MBank("MBank",123456789123L, 333333311);
        MBank asanMBank = new MBank("MBank", 442156789123L, 333333360);
        MBank usonMBank = new MBank("MBank", 999512437624L,333333330);
        MBank akylaiMBank = new MBank("MBank", 661523401726L, 333333372);


      //  OptimaBank ulugbekOptimabank = new OptimaBank("OptimaBank",123456781123L, 555555505);
     //   OptimaBank nataliyaOptimabank = new OptimaBank("OptimaBank",123015481663L, 555555500);
      //  OptimaBank sergeyOptimabank = new OptimaBank("OptimaBank",123099341112L, 555555510);

        DemirBank zinaidaDemirBank = new DemirBank("DemirBank",554142430125L, 888888891);
        DemirBank samatDemirBank = new DemirBank("DemirBank",951242430125L, 888888822);
        DemirBank azamatDemirBank = new DemirBank("DemirBank",789122430125L, 888888840);
        DemirBank elizaDemirBank = new DemirBank("DemirBank",124342993410L, 888888833);

        aliiaMBank.deposit(100000);
      //  Bank.transferFunds(aliiaMBank,ulugbekOptimabank, 500);


     //   BankBase.printallBankUserCount();

    }
}
