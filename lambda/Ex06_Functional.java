// 함수형 인터페이스는 람다식 전용 인터페이스이기 때문에 단 하나의 메서드만 가져야 한다.
// 이를 강제하기 위해 @FunctionalInterface 어노테이션을 사용한다.
@FunctionalInterface
interface Unit {
  String move();
  // void run();   // error
}

public class Ex06_Functional {

  public static void main(String[] args) {
    Unit unit = () -> {
      return "이동합니다.";
    };
    System.out.println(unit.move());
  }
}
