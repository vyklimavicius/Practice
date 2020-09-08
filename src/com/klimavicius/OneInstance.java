package com.klimavicius;

public class OneInstance {


    private static OneInstance soleInstance;
    private int number;

    private OneInstance() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static OneInstance getInstance() {

        if(soleInstance == null) {
            soleInstance = new OneInstance();
        } else {
            return soleInstance;
        }

        return soleInstance;
    }

}
