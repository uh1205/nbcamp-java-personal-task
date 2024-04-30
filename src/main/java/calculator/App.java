package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.nextLine().charAt(0);

        double result;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        }
        else if (operator == '-') {
            result = firstNumber - secondNumber;
        }
        else if (operator == '*') {
            result = firstNumber * secondNumber;
        }
        else if (operator == '/') {
            if (secondNumber == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return;
            }
            result = (double) firstNumber / secondNumber;
        } else {
            System.out.println("사칙연산 기호에 맞는 연산자를 사용해주세요.");
            return;
        }

        System.out.println("결과 : " + result);
    }
}