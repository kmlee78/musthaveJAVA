import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_TryCatch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    try {
      num1 = sc.nextInt(); // 문자열 입력시 InputMismatchException 발생
      num2 = 10 / num1; // 0으로 나누면 ArithmeticException 발생
    } catch (InputMismatchException | ArithmeticException e) { // 여러 예외를 한번에 처리
      System.out.println("예외 발생: " + e);
    } finally { // 예외 발생 여부와 상관없이 항상 실행
      sc.close();
    }

    try {
      num2 = 10 / num1;
    } catch (Exception e) { // 모든 예외를 처리
      System.out.println("예외 발생: " + e);
    }
  }
}
