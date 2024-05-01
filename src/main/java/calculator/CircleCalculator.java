package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {

    @Override
    public double calculate(String... strings) {
        return Math.PI * Math.pow(Double.parseDouble(strings[0]), 2);
    }
}
