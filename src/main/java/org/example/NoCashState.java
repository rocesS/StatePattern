package org.example;

public class NoCashState extends AtmState{
    public NoCashState(Atm atm) {
        super(atm);
    }

    @Override
    void insertCard() {
        System.out.println("Karta nie przyjęta - brak pieniędzy w bankomacie!");
    }

    @Override
    void insertPin(int pin) {
        System.out.println("Pin nie przyjęty - brak piniędzy w bankomacie!");
    }

    @Override
    void takeCash(int cash) {
        System.out.println("Nie wypłąciymy pieniędzy - brak pieniędzy w bankomacie!");
    }
}
