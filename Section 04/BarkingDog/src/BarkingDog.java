/**
 * Created by DiegoT on 28/05/2019.
 */
public class BarkingDog {
    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {
        boolean wakeUp = false;

        if (isDogBarking && (hourOfDay >= 0 && hourOfDay <=23)) {
            if(hourOfDay < 8 || hourOfDay > 22) {
                wakeUp = true;
            }
        }

        return wakeUp;
    }
}
