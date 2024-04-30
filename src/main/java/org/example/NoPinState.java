package org.example;

public class NoPinState extends AtmState{
    public NoPinState(Atm atm) {
        super(atm);
    }

    @Override
    void insertCard() {
        System.out.println("Najpierw podaj PIN, karta nie została przyjęta");
    }

    @Override
    void insertPin(int pin) {
        if (pin == 1234) {
            System.out.println("Pin poprawny, zmiana stanu na gotowy do wypłaty");
            atm.setState(new ReadyState(atm));
        } else {
            System.out.println("Niepoprawny pin");
        }
    }

    @Override
    void takeCash(int cash) {
        System.out.println("Nie można wypłącić, wpisz pin!");
    }
}
