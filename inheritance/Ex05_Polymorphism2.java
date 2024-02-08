abstract class Human {

  abstract void print();
}

class Man extends Human {

  void print() {
    System.out.println("남자");
  }
}

class Woman extends Human {

  void print() {
    System.out.println("여자");
  }
}

public class Ex05_Polymorphism2 {

  // 다형성을 이용한 객체 생성
  public static Human humanCreate(int kind) {
    if (kind == 1) {
      return new Man();
    } else {
      return new Woman();
    }
  }

  public static void main(String[] args) {
    Human h = humanCreate(1);
    h.print();

    h = humanCreate(2);
    h.print();
  }
}
