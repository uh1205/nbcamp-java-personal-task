package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<Double> results = new ArrayList<>();

    public double calculate(int firstNum, int secondNum, char operator) {
        return switch (operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield (double) firstNum / secondNum;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}