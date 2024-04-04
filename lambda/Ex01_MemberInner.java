// 멤버 내부 클래스
class Outer {

  private int speed = 10;

  class Inner {

    public void move() {
      System.out.println("Speed: " + speed);
    }
  }

  public void test() {
    Inner in = new Inner();
    in.move();
  }
}

public class Ex01_MemberInner {

  public static void main(String[] args) {
    Outer out = new Outer();
    out.test(); // Speed: 10

    // 내부 클래스 객체 생성 및 메서드 호출
    Outer.Inner in = out.new Inner();
    in.move(); // Speed: 10
  }
}
