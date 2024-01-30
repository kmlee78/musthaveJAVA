import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    menuLoop:while (true) {
      showMenu();
      char ch = sc.nextLine().charAt(0);
      if (!checkNum(ch)) {
        System.out.println("메뉴를 잘못 선택했습니다.");
        continue;
      }

      int num = ch - '0'; // char을 int로 변환
      if (num == 0) {
        break menuLoop;
      } else {
        if (num > 4) {
          System.out.println("메뉴를 잘못 선택했습니다.");
          continue;
        }
        processCalculation(sc, num);
        sc.nextLine();
      }
    }
    System.out.println("계산기를 종료합니다.");
  }

  public static void showMenu() {
    System.out.println("메뉴를 선택하세요.");
    System.out.println("1.더하기");
    System.out.println("2.빼기");
    System.out.println("3.곱하기");
    System.out.println("4.나누기");
    System.out.println("0.끝내기");
  }

  public static boolean checkNum(char ch) {
    if (ch >= '0' && ch <= '9') {
      return true;
    } else {
      return false;
    }
  }

  public static void processCalculation(Scanner sc, int num) {
    System.out.print("첫 번째 숫자:");
    int num1 = sc.nextInt();
    System.out.print("두 번째 숫자:");
    int num2 = sc.nextInt();

    switch (num) {
      case 1:
        addNum(num1, num2);
        break;
      case 2:
        minusNum(num1, num2);
        break;
      case 3:
        multiplyNum(num1, num2);
        break;
      case 4:
        divideNum(num1, num2);
        break;
    }
  }

  public static void addNum(int num1, int num2) {
    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);
  }

  public static void minusNum(int num1, int num2) {
    int result = num1 - num2;
    System.out.println(num1 + " - " + num2 + " = " + result);
  }

  public static void multiplyNum(int num1, int num2) {
    int result = num1 * num2;
    System.out.println(num1 + " * " + num2 + " = " + result);
  }

  public static void divideNum(int num1, int num2) {
    int result1 = num1 / num2;
    System.out.println(num1 + " / " + num2 + " = " + result1);
    int result2 = num1 % num2;
    System.out.println(num1 + " % " + num2 + " = " + result2);
  }
}
