package org.example;

public class Atm {

    private AtmState state;
    private double cash;

    public Atm() {
        state = new NoCardState(this);
        cash = 10_000;
    }

    public void insertCard(){
        state.insertCard();
    }

    public void insertPin(int pin){
        state.insertPin(pin);
    }

    public double getCash() {
        return cash;
    }

    public void takeCash(int cash){
        state.takeCash(cash);
    }

    public void setState(AtmState state) {
        this.state = state;
    }

    public void decreaseCash(double cash) {
        this.cash -= cash;
    }
}
