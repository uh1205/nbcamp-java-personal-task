package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    private final List<Double> results;

    public ArithmeticCalculator(List<Double> results) {
        this.results = results;
    }

    public double calculate(double firstNum, double secondNum, char operator) {
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

    @Override
    List<Double> getResult() {
        return results;
    }

    @Override
    void addResult(double result) {
        results.add(result);
    }

    @Override
    void removeResult() {
        results.remove(0);
    }

    @Override
    void inquiryResults() {
        for (Double result : results) {
            System.out.println(result);
        }
    }
}
