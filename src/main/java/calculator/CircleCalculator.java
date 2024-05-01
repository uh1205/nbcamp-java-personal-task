package calculator;

import java.util.List;

public class CircleCalculator implements Calculator {

    @Override
    public double calculate(String... strings) {
        return Math.PI * Math.pow(Double.parseDouble(strings[0]), 2);
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