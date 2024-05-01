package calculator;

import java.util.List;

public class ArithmeticCalculator implements Calculator {

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    private final ModOperator modOperator;

    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
        modOperator = new ModOperator();
    }

    @Override
    public double calculate(String... strings) {
        String firstNum = strings[0];
        String secondNum = strings[1];
        String operator = strings[2];

        return switch (operator) {
            case "+" -> addOperator.operate(firstNum, secondNum);
            case "-" -> subtractOperator.operate(firstNum, secondNum);
            case "*" -> multiplyOperator.operate(firstNum, secondNum);
            case "/" -> divideOperator.operate(firstNum, secondNum);
            case "%" -> modOperator.operate(firstNum, secondNum);
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }

    @Override
    public List<Double> getResult() {
        return results;
    }

    @Override
    public void addResult(double result) {
        results.add(result);
    }

    @Override
    public void removeResult() {
        results.remove(0);
    }

    @Override
    public void inquiryResults() {
        for (Double result : results) {
            System.out.println(result);
        }
    }
}