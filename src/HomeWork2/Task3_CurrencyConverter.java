package HomeWork2;

import java.util.Scanner;

public class Task3_CurrencyConverter {
    public static void main(String[] args) {
        //реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США.
        Task3_CurrencyConverter currencyConverter = new Task3_CurrencyConverter ();

        float amountEuro = currencyConverter.getAmountEuro();
        float multiplier = currencyConverter.getMultiplier();

        System.out.printf("Summa in Euro: %.2f, Dollars: %.2f (multiplier = %.2f)",
                amountEuro,
                currencyConverter.doConvertEuroToDollars(amountEuro, multiplier),
                multiplier);

    }

    public float getAmountEuro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plase enter amount in Euro: ");
        return scanner.nextFloat();
    }

    public float getMultiplier () {
        return 1.01f;

    }

    public float doConvertEuroToDollars(float amount, float multiplier) {
        return amount * multiplier;
    }

}
