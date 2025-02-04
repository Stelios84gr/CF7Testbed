package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δέχεται θερμοκρασία σε βαθμούς Κελσίου (double)
 * kai τη μετατρέπει σε βαθμούς Fahrenheit (double).
 */
public class CelsiusToFahrenheitApp111 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double tempCelsius = 0.0;
        double tempFahrenheit = 0.0;

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε βαθμούς Κελσίου:");
        tempCelsius = getCelsiusTemp();
        tempFahrenheit = tempConversion(tempCelsius);
        System.out.printf("Βαθμοί Κελσίου: %.2f\n Βαθμοί Φαρενάιτ: %.2f", tempCelsius, tempFahrenheit);

        sc.close();
    }

    public static double getCelsiusTemp() {
        while (!sc.hasNextDouble()) {
            System.out.println("Παρακαλώ εισάγετε έγκυρο αριθμό:");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static double tempConversion(double degCelsius) {
        return degCelsius * 9/5 + 32;
    }
}