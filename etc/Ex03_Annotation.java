interface Unit {
  @Deprecated
  public void move(); // 더 이상 사용되지 않는 메서드

  public void run();
}

class Marine implements Unit {

  @Override // 오버라이딩을 올바르게 했는지 컴파일러가 체크
  @SuppressWarnings("deprecation") // 사용하지 않는 메서드를 사용했을 때 경고를 무시
  public void move() {
    System.out.println("Marine move");
  }

  @Override
  public void run() {
    System.out.println("Marine run");
  }
}

public class Ex03_Annotation {

  public static void main(String[] args) {
    Marine marine = new Marine();
    marine.move();
    marine.run();
  }
}
