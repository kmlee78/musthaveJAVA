abstract class Unit { // 추상 클래스

  abstract void doMove();
}

class Marine extends Unit { // 추상 클래스를 상속받은 클래스

  void doMove() { // 추상 메서드 구현
    System.out.println("마린이 움직입니다.");
  }
}

class Ex02_Abstract {

  public static void main(String[] args) {
    Marine m = new Marine();
    m.doMove(); // 구현된 메서드 호출
  }
}
