public class MyCalculator {

  public static int adder(int num1, int num2) {
    return num1 + num2;
  }
}

public class Ex03_UtilMethod {

  public static void main(String[] args) {
    MyCalculator cal = new MyCalculator();
    int num1 = cal.adder(10, 20); // 객체를 생성하여 메서드 호출
    System.out.println(num1); // 30

    int result = MyCalculator.adder(10, 20); // static 메서드는 객체를 생성하지 않고도 호출 가능
    System.out.println(result); // 30
  }
}
