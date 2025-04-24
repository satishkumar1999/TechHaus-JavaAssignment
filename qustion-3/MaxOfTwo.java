//Return the larger of two numbers

public class MaxOfTwo {

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(getMax(5, 10));    // Output: 10
        System.out.println(getMax(12, 7));    // Output: 12
    }

}
