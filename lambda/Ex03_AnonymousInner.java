interface Unit {
  void show();
}

class Human {

  private int age = 20;

  public Unit getAge() {
    return new Unit() { // 클래스명을 생략하고 객체 생성
      public void show() {
        System.out.println("Age: " + age);
      }
    };
  }
}

public class Ex03_AnonymousInner {

  public static void main(String[] args) {
    Human h = new Human();
    Unit unit = h.getAge();
    unit.show(); // Age: 20
  }
}
