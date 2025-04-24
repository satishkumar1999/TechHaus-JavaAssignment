//Check if a number is a “two-digit special” integer

public class SpecialTwoDigitChecker {

    public static boolean isSpecialTwoDigit(int number) {
        if (number < 10 || number > 99) {
            return false;
        }

        int digit1 = number / 10;
        int digit2 = number % 10;
        int result = digit1 + digit2 + (digit1 * digit2);
        return result == number;
    }

    public static void main(String[] args) {
        System.out.println(isSpecialTwoDigit(59));  // true (5+9+5*9 = 59)
        System.out.println(isSpecialTwoDigit(23));  // false
    }

}
