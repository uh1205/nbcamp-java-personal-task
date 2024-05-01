package calculator;

import java.util.ArrayList;
import java.util.List;

public interface Calculator {

    List<Double> results = new ArrayList<>();

    double calculate(String... strings);

    List<Double> getResult();

    void addResult(double result);

    void removeResult();

    void inquiryResults();
}