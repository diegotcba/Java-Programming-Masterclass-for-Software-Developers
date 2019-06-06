/**
 * Created by DiegoT on 29/05/2019.
 */
public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number > 0) {
            int lastDigit = number % 10;

            reverse = reverse * 10;

            reverse += lastDigit;

            number /= 10;
        }

        if(originalNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }

}
