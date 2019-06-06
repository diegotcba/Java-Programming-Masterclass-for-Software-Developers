/**
 * Created by DiegoT on 03/06/2019.
 */
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        } else {
            return (firstNumber / secondNumber);
        }
    }
}
