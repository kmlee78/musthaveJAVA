class Calc {

  int add(int a, int b) {
    return a + b;
  }

  int add(int a) {
    return a + 1;
  }

  double add(double a, double b) {
    return a + b;
  }
}

public class Overloading {

  public static void main(String[] args) {
    Calc calc = new Calc();

    // 자바에서는 메서드명과 매개변수, 자료형까지 합쳐서 메서드를 구분한다.
    System.out.println(calc.add(3, 4)); // 7
    System.out.println(calc.add(3)); // 4
    System.out.println(calc.add(3.14, 4.14)); // 7.28
  }
}
