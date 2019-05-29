/**
 * Created by DiegoT on 29/05/2019.
 */
public class EqualSumChecker {
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int comparatorNumber) {
        int numbersSum = (firstNumber + secondNumber);

        return (numbersSum == comparatorNumber);
    }
}
