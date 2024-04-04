// 지역 내부 클래스
class Human {

  private int age = 20;

  public void getAge() {
    // 지역 내부 클래스
    // 해당 메소드 안에서만 객체 생성 가능
    class LocalInner {

      public void printAge() {
        System.out.println("Age: " + age);
      }
    }

    LocalInner in = new LocalInner();
    in.printAge();
  }
}

public class Ex02_LocalInner {

  public static void main(String[] args) {
    Human h = new Human();
    h.getAge(); // Age: 20
  }
}
