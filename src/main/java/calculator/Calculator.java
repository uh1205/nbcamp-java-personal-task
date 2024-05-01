package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    private final List<Double> results = new ArrayList<>();

    public abstract double calculate(String... strings);

    public List<Double> getResult() {
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