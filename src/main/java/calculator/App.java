package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = Integer.parseInt(sc.nextLine());
    }
}