package de.holger_peters.mylib;

public class Adder {
    int myIncrement;

    public Adder(int increment) {
        myIncrement = increment;
    }

    public int add(int aNumber) {
        return aNumber + myIncrement;
    }
}
