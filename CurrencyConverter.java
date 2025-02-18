import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be converted: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();

        double exchangeRate = getExchangeRate(sourceCurrency, targetCurrency);

        if (exchangeRate == 0) {
            System.out.println("Error: Unsupported currency conversion.");
        } else {

            double convertedAmount = amount * exchangeRate;
            System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        }

        scanner.close();
    }

    private static double getExchangeRate(String sourceCurrency, String targetCurrency) {
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;

        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18;
            
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            return 0.73;

        } else if (sourceCurrency.equals("GBP") && targetCurrency.equals("USD")) {
            return 1.37;

        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("GBP")) {
            return 0.87;

        } else if (sourceCurrency.equals("GBP") && targetCurrency.equals("EUR")) {
            return 1.15;

        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("JPY")) {
            return 110.63;

        } else if (sourceCurrency.equals("JPY") && targetCurrency.equals("USD")) {
            return 0.009;

        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("JPY")) {
            return 130.68;

        } else if (sourceCurrency.equals("JPY") && targetCurrency.equals("EUR")) {
            return 0.0077;

        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return 74.38;

        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("USD")) {
            return 0.013;

        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("INR")) {
            return 87.94;

        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("EUR")) {
            return 0.011;
        }

        return 0;
    }
}