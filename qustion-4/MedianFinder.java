//Find median of a sorted array

public class MedianFinder {

    public static double findMedian(double[] arr) {
        if (arr == null || arr.length == 0) {
            return -1.0;
        }
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new double[]{10.7}));                       // 10.7
        System.out.println(findMedian(new double[]{1.0, 2.0, 3.0}));              // 2.0
        System.out.println(findMedian(new double[]{17.4, 21.1, 39.7, 48.0}));     // 30.4
        System.out.println(findMedian(new double[]{-957, -493, -384, -268, -131})); // -384
        System.out.println(findMedian(new double[]{}));                           // -1.0
    }

}
