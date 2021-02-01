package com.klimavicius;

import java.util.Scanner;

public class Register {

    public static void main(String[] args) {

//        Scanner customerInput = new Scanner(System.in);
//        System.out.println("Please type the price: ");
//        double PP = customerInput.nextDouble();
//        System.out.println("Please type cash given: ");
//        double CH = customerInput.nextDouble();
//        System.out.println(makeChange("15.94;16.00"));
        System.out.println(makeChange("35;35"));
//        customerInput.close();

    }

    public enum Currency {

        ONEHUNDRED(100.00),
        FIFTY(50.00),
        TWENTY(20.00),
        TEN(10.00),
        FIVE(5.00),
        TWO(2.00),
        ONE(1.00),
        HALFDOLLAR(0.50),
        QUARTER(0.25),
        DIME(0.10),
        NICKEL(0.05),
        PENNY(0.01);

        private double money;

        Currency(double v) {
            this.money = v;
        }

        public double getMoney() {
            return this.money;
        }
    }

    public static String makeChange(String purchaseInfo) {
        /*
         * Given two decimal numbers first purchase price(PP)
         * second is cash(CH)
         * Calculate change to be returned
         * Output should be alphabetically sorted
         *
         */
         String[] purchaseDetails = purchaseInfo.split(";");
         Double PP = Double.parseDouble(purchaseDetails[0]);
         Double CH = Double.parseDouble(purchaseDetails[1]);
         if(CH < PP) return "ERROR";
         if(CH.equals(PP)) return "ZERO";

         double returnValue = CH - PP;
         StringBuilder returnMoney = new StringBuilder();

             for(Currency c: Currency.values()){
                 while(returnValue >= c.getMoney()){
                     returnMoney.append(c).append(",");
                     returnValue -= c.getMoney();
                 }
             }


         return new String(returnMoney).substring(0, returnMoney.length() - 1) + "";
    }
}
