//Income Tax Calculator

public class IncomeTaxCalculator {

    public static int calculateTax(int income) {
        int tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (int) ((income - 250000) * 0.10);
        } else if (income <= 1000000) {
            tax = (int) ((250000 * 0.10) + (income - 500000) * 0.20);
        } else {
            tax = (int) ((250000 * 0.10) + (500000 * 0.20) + (income - 1000000) * 0.30);
        }

        return tax;
    }

    public static void main(String[] args) {
        System.out.println(calculateTax(190000));     // 0
        System.out.println(calculateTax(345000));     // 9500
        System.out.println(calculateTax(780000));     // 81000
        System.out.println(calculateTax(2400000));    // 545000
    }

}
