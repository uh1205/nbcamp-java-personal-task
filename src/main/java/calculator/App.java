package calculator;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] result = new double[10]; // 연산 결과 10개를 저장할 수 있는 배열
        int count = 0; // 연산의 결과가 저장된 배열의 마지막 index 를 저장하는 변수

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = Integer.parseInt(sc.nextLine());

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = Integer.parseInt(sc.nextLine());

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            if (operator == '+') {
                result[count] = firstNumber + secondNumber;
            } else if (operator == '-') {
                result[count] = firstNumber - secondNumber;
            } else if (operator == '*') {
                result[count] = firstNumber * secondNumber;
            } else if (operator == '/') {
                if (secondNumber == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return;
                }
                result[count] = (double) firstNumber / secondNumber;
            } else {
                System.out.println("사칙연산 기호에 맞는 연산자를 사용해주세요.");
                return;
            }

            System.out.println("결과 : " + result[count++]);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        } while (!Objects.equals(sc.nextLine(), "exit"));
    }
}