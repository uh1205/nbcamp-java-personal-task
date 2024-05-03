package calculator;

public class CircleCalculator extends Calculator {

    static final double PI = 3.14159265358979323846;

    @Override
    public double calculate(String... strings) {
        return PI * Math.pow(Double.parseDouble(strings[0]), 2);
    }
}