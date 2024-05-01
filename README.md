# Java 1차 개인 과제

- [과제 소개](#과제-소개)
- [계산기 Level 1](#계산기-Level-1)
- [계산기 Level 2](#계산기-Level-2)

<br/>

## 과제 소개

- Java를 이용해 진화하는 계산기를 만들어보자!
- Level 1 ~ Level 3으로 이루어진 계산기 프로그램을 만들어보자.
- 제출 목표는 Level 2 계산기까지입니다.
- 각 레벨의 단계마다 commit을 남겨보자.

<br/>

## 계산기 Level 1

1. Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
- 양의 정수는 각각 하나씩 전달 받습니다.
    - 양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.

```java
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
    }
}
```

2. Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
- 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. (`charAt(0)`)

```java
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ...
        System.out.print("사칙연산 기호를 입력하세요: ");
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. 
    }
}
```

3. 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력합니다.
- 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
- 입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (e.g.if, switch)
- 연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
    - e.g. “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. “

```java
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ...
        int result = 0;
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        System.out.println("결과: " + result);
    }
}
```

4. 반복문을 사용하여 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정합니다.
- 반복문을 사용합니다. (e.g. for, while …)

```java
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 반복문 사용 해서 연산을 반복 */
        ...
        System.out.println("결과: " + result);
        
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        /* exit을 입력 받으면 반복 종료 */
    }
}
```

5. 연산 결과 10개를 저장할 수 있는 배열을 선언 및 생성하고 연산의 결과를 저장합니다.
- 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다.
- 연산의 결과를 비어있는 곳에 저장하기 위해 저장할 때마다 count 합니다.

```java
public class App {
    public static void main(String[] args) {
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        Scanner sc = new Scanner(System.in);
        ...
        System.out.println("결과: " + result);
        /* 연산의 결과를 배열에 저장합니다. */
        /* index를 증가 시킵니다. */
        ...
    }
}
```

6. 연산 결과가 10개를 초과하는 경우 가장 먼저 저장된 결과를 삭제하고 새로운 연산 결과가 저장될 수 있도록 소스 코드를 수정합니다.
- 현재 저장된 index가 마지막(9)라면 가장 먼저 저장된 결과 값이 삭제 되고 새로운 결과 값이 마지막 index에 저장될 수 있도록 구현합니다.
    - Hint : 결과 값들이 한칸씩 앞으로 이동되면 되지 않을까?

```java
public class App {
    public static void main(String[] args) {
        ...
        System.out.println("결과: " + result);
        ...
        /* 위 요구사항에 맞게 구현 */
        ...
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
    }
}
```

7. 연산 결과가 10개로 고정되지 않고 무한이 저장될 수 있도록 소스 코드를 수정합니다.
- JCF(Java Collection Framework)를 사용합니다. (e.g. List, Set …)
- “remove”라는 문자열을 입력받으면 가장 먼저 저장된 결과가 삭제될 수 있도록 구현합니다.

```java
public class App {
    public static void main(String[] args) {
        /* 적합한 컬렉션 타입의 변수 선언 */
        ...
        System.out.println("결과: " + result);
        /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        /* 위 요구사항에 맞게 구현 */
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
    }
}
```

8. “**inquiry”라는 문자열이 입력되면 저장된 연산 결과 전부를 출력합니다.**
- foreach(향상된 for문)을 활용하여 구현 해봅니다.

```java
public class App {
    public static void main(String[] args) {
        ...
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        ...
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        /* 위 요구사항에 맞게 구현 */
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
    }
}
```

<br/>

## 계산기 Level 2

1. 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
- 나눗셈에서 분모에 0이 들어오거나 연산자 기호가 잘 못 들어온 경우 적합한 Exception 클래스를 생성하여 throw 합니다. (매개변수로 해당 오류 내용을 전달합니다.)

```java
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */

    public 반환타입 calculate(...매개변수) {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
    }
}
```

2. Level 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정합니다.
- 연산 수행 역할은 Calculator 클래스가 담당합니다.
    - 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장됩니다.
- 소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다.

```java
public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            /* 위 요구사항에 맞게 소스 코드 수정 */

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ...
        /* 반복문 종료 */
    }
}
```

3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정합니다. (캡슐화)
- 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
- 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
- 위 요구사항을 모두 구현 했다면 App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용 해봅니다.

```java
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    
    public 반환타입 calculate(...매개변수) {
        ...
    }
    
    /* Getter 메서드 구현 */
    /* Setter 메서드 구현 */
}

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            /* 위 요구사항에 맞게 소스 코드 수정 */

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ...
        /* 반복문 종료 */
    }
}
```

4. Calculator 클래스에 저장된 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정합니다.

```java
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    
    public 반환타입 calculate(...매개변수) {
        ...
    }
    
    ...
    
    public void removeResult() {
        /* 구현 */
    }
}

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            /* 위 요구사항에 맞게 소스 코드 수정 */

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ...
        /* 반복문 종료 */
    }
}
```

5. Calculator 클래스에 저장된 연산 결과들을 조회하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 조회 메서드가 활용될 수 있도록 수정합니다.

```java
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    
    public 반환타입 calculate(...매개변수) {
        ...
    }
    
    ...

    public void inquiryResults() {
        /* 구현 */
    }
}

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            /* 위 요구사항에 맞게 소스 코드 수정 */

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            ...
        /* 반복문 종료 */
    }
}
```

6. Calculator 인스턴스를 생성(new)할 때 생성자를 통해 연산 결과를 저장하고 있는 컬렉션 필드가 초기화 되도록 수정합니다.

```java
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    /* 생성자 구현 */
    ...
}

public class App {
    public static void main(String[] args) {
        /* 위 요구사항에 맞게 Calculator 인스턴스 생성 부분 수정 */

        ...
    }
}
```

7. Calculator 클래스에 반지름을 매개변수로 전달받아 원의 넓이를 계산하여 반환해주는 메서드를 구현합니다.
- APP 클래스의 main 메서드에 Scanner를 활용하여 사칙연산을 진행할지 원의 넓이를 구할지 명령어를 입력 받은 후 원의 넓이를 구하는 것을 선택했을 때 원의 반지름을 입력 받아 원의 넓이를 구한 후 출력되도록 구현합니다.
    - 기존에 구현되어있던 사칙연산 기능은 수정 후에도 반드시 이전과 동일하게 동작해야합니다.
- 이때, static, final 키워드를 활용할 수 있는지 고민한 후 활용 해봅니다.
    - 반드시 static, final 키워드에 대한 설명과 활용한 이유에 대해 주석으로 작성합니다.
- 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성
    - 계산된 원의 넓이를 저장합니다.
    - 생성자로 초기화됩니다.
    - 외부에서 직접 접근할 수 없습니다.
    - Getter, Setter 메서드를 구현합니다.
    - 원의 넓이 결과값들을 조회하는 메서드를 구현합니다.

```java
public class Calculator {
    /* static, final 활용 */
    /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */
    /* 생성자 수정 */
    ...
    
    /* 원의 넓이를 구하는 메서드 선언*/
    public 반환타입 calculateCircleArea(매배변수) {
        /* 원의 넓이 계산 구현 */
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
}

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
            /* 사칙연산을 진행할지 원의 너비를 구할지 선택 구현 */
            ...
            /* 원의 넓이를 구하는 경우 반지름을 입력받아 원의 넓이를 구한 후 출력*/
            /* 원의 넓이 저장 */
            /* 저장된 원의 넓이 값들 바로 전체 조회 */
        
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        /* 반복문 종료 */
    }
}
```

8. 사칙연산을 수행하는 계산기 ArithmeticCalculator 클래스와 원과 관련된 연산을 수행하는 계산기 CircleCalculator 클래스 2개를 구현합니다.
- 기존에 만들어둔 Calculator 클래스를 수정합니다
- 수정한 Calculator 클래스를 활용하여 ArithmeticCalculator, CircleCalculator 클래스를 구현 해봅니다. (상속)
- 위 요구사항을 구현하게되면 App 클래스의 main 메서드에 오류가 발생할 겁니다.
    - 구현한 클래스들을 활용하여 오류가 발생하지 않고 활용될 수 있도록 수정 해보세요!
    - 기존에 사칙연산을 저장하던 컬렉션 필드의 타입을 Double로 변경해도 괜찮습니다.
    - 필드의 접근 제어자를 변경해도 괜찮습니다.

```java
public /* Hint */ class Calculator {
    /* 수정 */
}

public class ArithmeticCalculator /* Hint */ {
    /* 구현 */
}

public class CircleCalculator /* Hint */ {
    /* 구현 */
}

public class App {
    public static void main(String[] args) {
        /* 수정 */
    }
}
```

9. ArithmeticCalculator 클래스의 연산 메서드에 책임(역할)이 많아 보입니다. 사칙연산 각각의 기능을 담당하는 AddOperator, SubtractOperator, MultiplyOperator, DivideOperator 클래스를 만들어 연산 메서드의 책임을 분리 해봅니다. (SRP)
- Calculator 클래스에 사칙연산 클래스들을 어떻게 활용할 수 있을지 고민 해봅니다. (포함 관계)
- 활용 방법을 찾아 적용했을 때 사칙연산 클래스들을 초기화 해야하는데 이때, 반드시 생성자를 활용해 봅니다.
- 마찬가지로 ArithmeticCalculator 클래스의 연산 메서드를 수정 하더라도 이전과 똑같이 동작해야합니다.
    
    ```java
    public class AddOperator {
        public int operate(매개변수) {
            /* 구현 */
        }
    }
    
    public class SubtractOperator {
        public int operate(매개변수) {
             /* 구현 */
        }
    }
    
    public class MultiplyOperator {
        public int operate(매개변수) {
             /* 구현 */
        }
    }
    
    public class DivideOperator {
        public int operate(매개변수) {
             /* 구현 */
        }
    }
    
    public class ArithmeticCalculator /* Hint */ {
        /* 수정 */
    }
    
    public class App {
        public static void main(String[] args) {
            /* 수정 */
        }
    }
    ```
    
10. ArithmeticCalculator 클래스에 추가로 나머지 연산(%) 기능을 추가하기 위해 ModOperator 클래스를 만들어 추가합니다. 
- 추가하려고 하니 앞으로 계속 기능이 추가되면 여러 부분의 소스코드를 수정해야 한다는 생각이 들었고 “현재 비효율적인 구조가 아닌가?” 라는 의구심이 들었습니다.
    - 따라서 소스 코드의 변경은 최소화하면서 기능을 쉽게 추가(확장)할 수 있는 방법을 고민 해봅니다. (OCP)
- 방법을 고민 및 학습하여 적용했을 때 전체적인 소스 코드와 구조의 변경이 발생 했을 겁니다.
    - 최대한 생각한 방법으로 구현 해보세요. 틀린 답은 없습니다. 컴파일에 문제가 없고 기능이 정상적으로 동작 하면 모두 정답입니다.
    - 포기하는 것 보다 본인이 생각한데로 구현해보고 다른 개발자들과 공유 하면서 여러 가지 방법들을 확인 했을 때 실력이 가장 많이 향상됩니다.
- 마찬가지로 수정 후에도 이전과 똑같이 동작해야합니다.

```java
/* Hint : Interface & (다형성의 원리) 등을 활용 */

public class ModOperator /* Hint */ {
    public int operate(매개변수) {
        /* 구현 */
    }
}

public class AddOperator /* Hint */ {
    public int operate(매개변수) {
        ...
    }
}

public class SubtractOperator /* Hint */ {
    public int operate(매개변수) {
         ...
    }
}

public class MultiplyOperator /* Hint */ {
    public int operate(매개변수) {
         ...
    }
}

public class DivideOperator /* Hint */ {
    public int operate(매개변수) {
        ...
    }
}

public class ArithmeticCalculator /* Hint */ {
    /* 수정 */
}

public class App {
    public static void main(String[] args) {
        /* 수정 */
    }
}
```
