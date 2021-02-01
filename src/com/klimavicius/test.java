package com.klimavicius;

public interface test {

    default void printHello() {
        System.out.println("Hello");
    }

    default void printPff() {
        System.out.println("pff");
    }

}
