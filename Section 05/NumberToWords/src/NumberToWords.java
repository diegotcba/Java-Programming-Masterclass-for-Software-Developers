/**
 * Created by DiegoT on 30/05/2019.
 */
public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
        numberToWords(123);
        numberToWords(1000);
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int count = 0;
        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversedNumber /= 10;
            count++;
        }

        for (int i = 1; i <= digitCount-count; i++) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }

        int digitCount = 0;

        while(number > 0) {
            number /= 10;

            digitCount++;
        }

        return digitCount;
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            reverse = reverse * 10;

            reverse += lastDigit;

            number /= 10;
        }

        return reverse;
    }
}
