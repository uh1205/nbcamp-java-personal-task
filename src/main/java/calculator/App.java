package calculator;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] results = new double[10]; // 연산 결과 10개를 저장할 수 있는 배열
        int index = 0; // 연산의 결과가 저장된 배열의 마지막 인덱스를 저장하는 변수

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = Integer.parseInt(sc.nextLine());

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = Integer.parseInt(sc.nextLine());

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            double result;

            if (operator == '+') {
                result = firstNumber + secondNumber;
            } else if (operator == '-') {
                result = firstNumber - secondNumber;
            } else if (operator == '*') {
                result = firstNumber * secondNumber;
            } else if (operator == '/') {
                if (secondNumber == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return;
                }
                result = (double) firstNumber / secondNumber;
            } else {
                System.out.println("사칙연산 기호에 맞는 연산자를 사용해주세요.");
                return;
            }

            System.out.println("결과 : " + result); // 연산 결과 출력

            if (index > 9) {    // 연산 결과가 10개를 초과하는 경우 (index = 10)
                for (int i = 0; i < 9; i++) {
                    results[i] = results[i + 1]; // 배열을 왼쪽으로 시프트하고,
                }
                results[index-- - 1] = result; // 새로운 연산 결과 값을 배열의 마지막 인덱스에 저장
            } else {
                results[index++] = result; // 연산 결과를 배열에 넣고, index 값을 1 늘린다.
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!Objects.equals(sc.nextLine(), "exit"));
    }
}