//Compounded Retail Inflation

public class RetailInflationCalculator {

    public static double calculateCompoundedInflation(double rate, int years) {
        double inflationMultiplier = Math.pow(1 + rate / 100, years);
        return Math.round((inflationMultiplier - 1) * 100);
    }

    public static void main(String[] args) {
        System.out.println(calculateCompoundedInflation(20, 5));  // 149
    }

}
