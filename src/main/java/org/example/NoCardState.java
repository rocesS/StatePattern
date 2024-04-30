package org.example;

public class NoCardState extends AtmState{

    public NoCardState(Atm atm) {
        super(atm);
    }


    @Override
    void insertCard() {
        System.out.println("Karta przyjęta, zmiana stanu: oczekiwanie pinu");
        atm.setState(new NoPinState(atm));
    }

    @Override
    void insertPin(int pin) {
        System.out.println("Nie można wprawdzić PIN - najpierw włóż kartę");
    }

    @Override
    void takeCash(int cash) {
        System.out.println("Najpierw karta, potem pieniądze");
    }
}
