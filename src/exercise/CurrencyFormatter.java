package exercise;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static String usFormat(double payment) {
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return usFormat.format(payment);
    }

    public static String inFormat(double payment) {
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        return indiaFormat.format(payment);
    }

    public static String chinaFormat(double payment) {
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return chinaFormat.format(payment);
    }

    public static String franceFormat(double payment) {
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return franceFormat.format(payment);
    }
}
