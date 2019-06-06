/**
 * Created by DiegoT on 02/06/2019.
 */
public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int BIG_FLOUR_BAG_KILOS = 5;
        int SMALL_FLOUR_BAG_KILOS = 1;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int sumKilos = (bigCount * BIG_FLOUR_BAG_KILOS) + (smallCount * SMALL_FLOUR_BAG_KILOS);
        int kilosDiff = sumKilos - goal;

        if (sumKilos <= goal) {
            return true;
        } else {
            if((int)(kilosDiff / BIG_FLOUR_BAG_KILOS) <= bigCount || (int)(kilosDiff / SMALL_FLOUR_BAG_KILOS) <= smallCount) {
                return true;
            }
        }

        return false;
    }
}
