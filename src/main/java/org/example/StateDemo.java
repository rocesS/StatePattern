package org.example;

//STATE
public class StateDemo {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.insertCard();
        atm.insertPin(1234);
        atm.takeCash(1000);
        atm.takeCash(100);

        }
    }


