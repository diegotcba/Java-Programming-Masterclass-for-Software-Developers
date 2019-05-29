package com.diegot;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is " + result);
        result++;
        System.out.println("Result is " + result);
        result--;
        System.out.println("Result is " + result);

        result += 2;
        System.out.println("Result is " + result);
        result *= 10;
        System.out.println("Result is " + result);
        result -= 10;
        System.out.println("Result is " + result);
        result /= 10;
        System.out.println("Result is " + result);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not a alien.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.
        double firstNumber = 20d;
        double secondNumber = 80d;
        double total = (firstNumber + secondNumber) * 25;
        double remainder = total % 40;

        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}
