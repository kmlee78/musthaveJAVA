interface Greet {
  void greet(); // 인터페이스의 메서드는 추상 메서드로, 반드시 구현해야 함
}

interface Talk {
  void talk();

  default void shout(); // default 메서드는 구현하지 않아도 됨
}

// 인터페이스는 추상클래스와 달리 다중 상속이 가능하다.
class Morning implements Greet, Talk {

  public void greet() {
    System.out.println("Good morning!");
  }

  public void talk() {
    System.out.println("It's a beautiful day!");
  }
}

class Ex03_Interface {

  public static void main(String[] args) {
    Morning m = new Morning();
    m.greet(); // Good morning!
    m.talk(); // It's a beautiful day!
  }
}
