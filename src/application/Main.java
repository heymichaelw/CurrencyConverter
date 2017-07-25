package application;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        String currencyChoiceString = "";

        System.out.println("----CURRENCY CONVERTER----");
        System.out.println("What currency are you converting FROM? (1-4)");
        System.out.println("1. USD   2. EUR   3. JPY   4. BTC");
        int currencyChoice = scanner.nextInt();
        switch (currencyChoice){
            case 1:
                currencyChoiceString = "USD";
                break;
            case 2:
                currencyChoiceString = "EUR";
                break;
            case 3:
                currencyChoiceString = "JPY";
                break;
            case 4:
                currencyChoiceString = "BTC";
                break;
        }
        System.out.println("How much money are you converting?");
        double currencyValue = scanner.nextDouble();
        Money newMoney = new Money(currencyValue, currencyChoiceString);
        System.out.println("What currency would you like to convert TO? (1-4)");
        System.out.println("1. USD   2. EUR   3. JPY   4. BTC");
        int conversionChoice = scanner.nextInt();
        switch(conversionChoice){
            case 1:
                System.out.println(newMoney.toUSD() + " USD");
                break;
            case 2:
                System.out.println(newMoney.toEUR() + " EUR");
                break;
            case 3:
                System.out.println(newMoney.toJPY() + " JPY");
                break;
            case 4:
                System.out.println(newMoney.toBTC() + " BTC");
                break;
        }

    }
}
