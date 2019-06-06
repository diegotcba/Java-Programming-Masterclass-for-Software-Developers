/**
 * Created by DiegoT on 02/06/2019.
 */
public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 0;

        int count = 2;
        while (count <= number) {
            if(number % count == 0) {
                largestPrime = count;
                number = number / count;
                count = 1;
            }

            count++;
        }

        return largestPrime;
    }
}
