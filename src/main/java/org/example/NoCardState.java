package org.example;

public class NoCardState extends AtmState{

    public NoCardState(Atm atm) {
        super(atm);
    }

    @Override
    void insertCard() {
        System.out.println("Karta przyjęta, zmiana stanu: oczekiwanie pinu");
            if (atm.getCash() <= 100) {
                System.out.println("Zbyt mało pieniędzy w bankomacie - bankomat zmienia stan na zablokowany - przyjdz jutro");
                atm.setState(new NoCashState(atm));
                return;
            }
        atm.setState(new NoPinState(atm));
        System.out.println("Karta przyjęta, zmiana stanu: okiwianie pinu");
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
