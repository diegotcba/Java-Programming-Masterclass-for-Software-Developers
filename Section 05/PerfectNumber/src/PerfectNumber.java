/**
 * Created by DiegoT on 30/05/2019.
 */
public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }

        int sumProperDivisors = 0;

        int divisor = 1;
        while (divisor < number) {
            if(number % divisor == 0) {
                sumProperDivisors += divisor;
            }

            divisor++;
        }

        return (sumProperDivisors == number);
    }
}
