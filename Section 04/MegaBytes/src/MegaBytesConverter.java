/**
 * Created by DiegoT on 28/05/2019.
 */
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        final int MEGABYTES_BYTES_RATE_CONVERSION = 1024;

        int megaBytes = (kiloBytes / MEGABYTES_BYTES_RATE_CONVERSION);

        int remainingKiloBytes = (kiloBytes % MEGABYTES_BYTES_RATE_CONVERSION);

        if(kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
