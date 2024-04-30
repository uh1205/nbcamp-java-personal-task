package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {

    private final List<Double> results;

    public CircleCalculator(List<Double> results) {
        this.results = results;
    }

    public double calculate(double radius) {
        return Math.PI * Math.pow(radius, 2);
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
