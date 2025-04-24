//Convert seconds into Days, Hours, Minutes, Seconds

public class TimeConverter {

    public static void convertSeconds(int totalSeconds) {
        int days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);

        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println(days + " Day(s) " + hours + " Hour(s) "
                + minutes + " Minute(s) " + seconds + " Second(s)");
    }

    public static void main(String[] args) {
        convertSeconds(21893872);  // 253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)
    }

}
