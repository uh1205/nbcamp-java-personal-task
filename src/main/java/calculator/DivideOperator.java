package calculator;

public class DivideOperator {

    public Double operate(String firstNum, String secondNum) {
        if (Double.parseDouble(secondNum) == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
    }
}
