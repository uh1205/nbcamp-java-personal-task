package calculator;

import java.util.List;

public class Calculator {

    // 사칙연산 결과를 저장하는 리스트
    private final List<Double> results;
    // 원 넓이 연산 결과를 저장하는 리스트
    private final List<Double> resultsOfCircle;

    // 생성자
    public Calculator(List<Double> results, List<Double> resultsOfCircle) {
        this.results = results;
        this.resultsOfCircle = resultsOfCircle;
    }

    // 사칙연산 메서드
    public double calculate(int firstNum, int secondNum, char operator) {
        return switch (operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield (double) firstNum / secondNum;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }

    // 원 넓이 연산 메서드
    public double calculateCircleArea(int radius) {
        return Math.PI * radius * radius;
        /**
         * Math.PI를 이용하지 않는 방법 : 상수 이용!
         * static final PI = 3.141592;
         * PI는 값이 반드시 한 개이며 불변인 값이고, 모든 인스턴스가 공유 가능해야 하므로
         * static final 키워드를 사용해 상수로 정의할 수 있다.
         */
    }

    // 사칙연산 결과를 저장하는 results 리스트를 반환하는 메서드
    public List<Double> getResults() {
        return results;
    }

    // 원 넓이 연산 결과를 저장하는 resultsOfCircle 리스트를 반환하는 메서드
    public List<Double> getResultsOfCircle() {
        return resultsOfCircle;
    }

    // results 리스트에 사칙연산 결과를 저장하는 메서드
    public void addResult(double result) {
        results.add(result);
    }

    // resultsOfCircle 리스트에 원 넓이 연산 결과를 저장하는 메서드
    public void addCircleResult(double result) {
        resultsOfCircle.add(result);
    }

    // results 리스트의 첫 번째 연산 결과를 삭제하는 메서드
    public void removeResult() {
        results.remove(0);
    }

    // resultsOfCircle 리스트의 첫 번째 연산 결과를 삭제하는 메서드
    public void removeCircleResult() {
        resultsOfCircle.remove(0);
    }

    // results 리스트를 출력하는 메서드
    public void inquiryResults() {
        for (Double result : results) {
            System.out.println(result);
        }
    }

    // resultsOfCircle 리스트를 출력하는 메서드
    public void inquiryCircleResults() {
        for (Double result : resultsOfCircle) {
            System.out.println(result);
        }
    }
}