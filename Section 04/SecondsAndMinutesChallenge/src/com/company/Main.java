package com.company;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(94, 5));

        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long totalHours = minutes / 60;

        long totalMinutes = minutes % 60;

        return ((totalHours < 10 ? "0":"") + totalHours + "h " +
                (totalMinutes < 10 ? "0":"") + totalMinutes + "m " +
                (seconds < 10 ? "0":"") + seconds + "s");
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long totalMinutes = seconds / 60;

        long totalSeconds = seconds % 60;

        return getDurationString(totalMinutes, totalSeconds);
    }
}
