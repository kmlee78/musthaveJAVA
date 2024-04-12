interface Unit {
  void move(String s);
}

interface Plus {
  int add(int a, int b);
}

interface Void {
  void print();
}

public class Ex05_LambdaRule {

  public static void main(String[] args) {
    Unit unit;

    // 줄임 없는 표현
    unit =
      (String s) -> {
        System.out.println(s);
      };

    // 중괄호 안의 구현부가 한 문장이면 중괄호를 생략할 수 있다.
    unit = (String s) -> System.out.println(s);

    // 매개변수가 하나이면 자료형과 소괄호를 생략할 수 있다.
    unit = s -> System.out.println(s);

    // return 문이 있는 경우 중괄호를 생략할 수 없다.
    // unit = s -> return s; // 에러

    // 매개변수가 두 개 이상이면 소괄호를 생략할 수 없다.
    // unit = s1, s2 -> System.out.println(s1 + s2); // 에러

    // 중괄호 안의 구현부가 반환문 하나면 return과 중괄호를 생략할 수 있다.
    Plus plus = (a, b) -> a + b;

    // 매개변수가 없을 경우에는 소괄호를 생략할 수 없다.
    Void v = () -> System.out.println("Hello, Lambda!");
  }
}
