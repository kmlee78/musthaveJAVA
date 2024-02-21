import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_ThrowsInMethod {

  public static void method1() {
    method2();
  }

  public static void method2()
    throws ArithmeticException, InputMismatchException {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    num1 = sc.nextInt(); // 문자열 입력시 InputMismatchException 발생
    num2 = 10 / num1; // 0으로 나누면 ArithmeticException 발생
    sc.close();
  }

  public static void main(String[] args) {
    try {
      method1();
    } catch (Throwable e) {
      // 던져진 것을 처리한다는 의미로 Exception의 상위 클래스인 Throwable을 사용
      System.out.println("예외 발생: " + e);
    }
  }
}
