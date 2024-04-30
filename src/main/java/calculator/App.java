package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("사칙 연산을 진행하려면 1을, 원의 넓이를 구하려면 아무거나 입력하세요: ");
            if (Objects.equals(sc.nextLine(), "1")) {
                calculateArithmetic(sc, new ArithmeticCalculator(new ArrayList<>()));
            } else {
                calculateCircle(sc, new CircleCalculator(new ArrayList<>()));
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!Objects.equals(sc.nextLine(), "exit"));
    }

    private static void calculateArithmetic(Scanner sc, ArithmeticCalculator calc) {
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.nextLine().charAt(0);

        double result = calc.calculate(firstNumber, secondNumber, operator); // 연산 수행
        System.out.println("결과 : " + result); // 연산 결과 출력
        calc.addResult(result); // 연산 결과 저장

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        if (Objects.equals(sc.nextLine(), "remove")) {
            calc.removeResult();
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if (Objects.equals(sc.nextLine(), "inquiry")) {
            calc.inquiryResults();
        }
    }

    private static void calculateCircle(Scanner sc, CircleCalculator calc) {
        System.out.print("반지름을 입력하세요: ");
        int radius = Integer.parseInt(sc.nextLine());

        double result = calc.calculate(radius); // 연산 수행
        System.out.println("결과 : " + result); // 연산 결과 출력
        calc.addResult(result); // 연산 결과 저장

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        if (Objects.equals(sc.nextLine(), "remove")) {
            calc.removeResult();
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if (Objects.equals(sc.nextLine(), "inquiry")) {
            calc.inquiryResults();
        }
    }
}