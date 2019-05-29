/**
 * Created by DiegoT on 28/05/2019.
 */
public class SpeedConverter {
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = -1L;
        final float MILES_KILOMETERS_RATE_CONVERSION = 1.609f;

        if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / MILES_KILOMETERS_RATE_CONVERSION);
        }

        return milesPerHour;
    }
}
