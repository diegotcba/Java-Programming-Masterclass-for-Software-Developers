import java.util.Scanner;

/**
 * Created by DiegoT on 03/06/2019.
 */
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        int count = 0;
        while(true) {

            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }

        average = (int)Math.round((double)sum / (double)count);

        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}


