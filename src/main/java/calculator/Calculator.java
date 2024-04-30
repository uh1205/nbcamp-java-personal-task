package calculator;

import java.util.List;

public class Calculator {

    private final List<Double> results;

    public Calculator(List<Double> results) {
        this.results = results;
    }

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

    public List<Double> getResults() {
        return results;
    }

    public void addResult(double result) {
        results.add(result);
    }

    public void removeResult() {
        results.remove(0);
    }

    public void inquiryResults() {
        for (Double result : results) {
            System.out.println(result);
        }
    }
}