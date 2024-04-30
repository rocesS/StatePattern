package org.example;

public class ReadyState extends AtmState{

    public ReadyState(Atm atm) {
        super(atm);
    }

    @Override
    void insertCard() {
        System.out.println("Karta już wprowadzona");
    }

    @Override
    void insertPin(int pin) {
        System.out.println("Pin już wprowadzony, możesz wypłacić");
    }

    @Override
    void takeCash(int cash) {
        if (cash > atm.getCash()) {
            System.out.println("Zbyt duża ilość pieniędzy - wprowadź niższą kwotę");
            return;
        } else if (cash <= 0) {
            System.out.println("Należy podać dodatnią wartość");
            return;
        }
        System.out.println("Wypłącam gotówkę");
        atm.decreaseCash(cash);
        atm.setState(new NoCardState(atm));
        System.out.println("Zwracam kartę, miłego dnia");
    }
}
