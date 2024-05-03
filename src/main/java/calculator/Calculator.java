package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    private final List<Double> resultList = new ArrayList<>();

    public abstract double calculate(String... strings);

    public List<Double> getResultList() {
        return resultList;
    }

    public void addResult(double result) {
        resultList.add(result);
    }

    public void removeResult() {
        resultList.remove(0);
    }

    public void inquiryResults() {
        for (Double result : getResultList()) {
            System.out.println(result);
        }
    }
}