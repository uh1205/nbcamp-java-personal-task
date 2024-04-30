package calculator;

import java.util.List;

public abstract class Calculator {

    abstract List<Double> getResult();

    abstract void addResult(double result);

    abstract void removeResult();

    abstract void inquiryResults();
}