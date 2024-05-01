package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator(AddOperator addOperator, SubtractOperator subtractOperator, MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
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
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}