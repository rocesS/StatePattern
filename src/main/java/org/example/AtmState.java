package org.example;

public abstract class AtmState {

    Atm atm;

    public AtmState(Atm atm) {
        this.atm = atm;
    }

    abstract void insertCard();
    abstract void insertPin(int pin);
    abstract void takeCash(int cash);

}
