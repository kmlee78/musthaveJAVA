interface Unit {
  void move(String s);
}

public class Ex04_Lambda {

  public static void main(String[] args) {
    // 람다식 변환 전
    Unit unit1 = new Unit() {
      public void move(String s) {
        System.out.println(s + " 이동합니다.");
      }
    };

    // 람다식 변환 후
    // 1. 익명 클래스의 이름과 외부 중괄호를 제거
    // 2. 메소드의 이름과 리턴 타입을 제거, 화살표(->) 추가
    // 3. 함수 실행문을 남기고 세리콜론으로 끝내기
    Unit unit2 = (String s) -> {
      System.out.println(s + " 이동합니다.");
    };
  }
}
