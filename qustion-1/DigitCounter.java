//Count number of digits in an integer

public class DigitCounter {

    public static int countDigits(int number) {
        number = Math.abs(number);
        return String.valueOf(number).length();
    }

    public static void main(String[] args) {
        System.out.println(countDigits(34));     // Output: 2
        System.out.println(countDigits(-7291));  // Output: 4
    }

}
