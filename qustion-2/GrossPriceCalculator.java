//Calculate gross price before tax

public class GrossPriceCalculator {

    public static double calculateGrossPrice(double netPrice, double taxRate) {
        return Math.round((netPrice / (1 + taxRate)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(calculateGrossPrice(99.95, 0.12));       // 89.24
        System.out.println(calculateGrossPrice(49999.00, 0.28));    // 39061.72
        System.out.println(calculateGrossPrice(720.00, 0.05));      // 685.71
        System.out.println(calculateGrossPrice(45.00, 0.00));       // 45.00
    }
}
