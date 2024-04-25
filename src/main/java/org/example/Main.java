package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczbaPierwsza, liczbaDruga, operacja;
        System.out.println("Podaj liczbę");
        liczbaPierwsza = scanner.nextInt();
        System.out.println("Podaj drugą liczę");
        liczbaDruga = scanner.nextInt();





    }

    public static int dodawanie (int a, int b) {
        return a + b;
    }

    public static int odejmowanie (int a, int b) {
        return a - b;
    }

    public static int mnozenie(int a, int b) {
        return a * b;
    }

    public static int dzielenie (int a, int b) {
        return a / b;
    }

}

