/**
 * Created by DiegoT on 30/05/2019.
 */
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        int lastDivisor;
        int greatestCommonDivisor = 1;

        if(first <= second) {
            lastDivisor = first;
        } else {
            lastDivisor = second;
        }

        for (int i = 1; i <= lastDivisor; i++) {
            if(first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }
}
