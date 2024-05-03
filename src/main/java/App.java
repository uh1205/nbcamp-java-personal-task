import calculator.ArithmeticCalculator;
import calculator.Calculator;
import calculator.CircleCalculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator;
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();
        double result;

        do {
            System.out.print("사칙 연산을 진행하려면 1을, 원의 넓이를 구하려면 아무거나 입력하세요: ");
            if (Objects.equals(sc.nextLine(), "1")) {
                // 사칙 연산
                calculator = arithmeticCalculator;

                System.out.print("첫 번째 숫자를 입력하세요: ");
                String firstNum = sc.nextLine();

                System.out.print("두 번째 숫자를 입력하세요: ");
                String secondNum = sc.nextLine();

                System.out.print("사칙연산 기호를 입력하세요: ");
                String operator = sc.nextLine();

                result = calculator.calculate(firstNum, secondNum, operator);

            } else {
                // 원 넓이 계산
                calculator = circleCalculator;

                System.out.print("반지름을 입력하세요: ");
                String radius = sc.nextLine();

                result = calculator.calculate(radius);
            }

            System.out.println("결과 : " + result);
            calculator.addResult(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (Objects.equals(sc.nextLine(), "remove")) {
                calculator.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (Objects.equals(sc.nextLine(), "inquiry")) {
                calculator.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!Objects.equals(sc.nextLine(), "exit"));
    }
}