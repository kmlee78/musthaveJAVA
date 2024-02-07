class Unit {

  String name;
  int hp;

  void printUnit() {
    System.out.println("name: " + name);
    System.out.println("hp: " + hp);
  }
}

class Marine extends Unit {

  int attack;

  void printMarine() {
    printUnit(); // 상속받은 메서드 호출
    System.out.println("attack: " + attack);
  }
}

class Medic extends Unit {

  int heal;

  void printUnit() { // 오버라이딩
    super.printUnit(); // 부모 클래스의 메서드 호출
    System.out.println("heal: " + heal);
  }
}

public class Ex01_MyUnit {

  public static void main(String[] args) {
    Marine m = new Marine();
    m.name = "마린";
    m.hp = 40;
    m.attack = 5;
    m.printMarine(); // 상속받은 메서드 호출

    Medic md = new Medic();
    md.name = "메딕";
    md.hp = 60;
    md.heal = 10;
    md.printUnit(); // 오버라이딩된 메서드 호출
  }
}

final int MAX_NUM = 100; // final 키워드를 사용하여 상수 선언
final class FinalClass { // final 클래스는 상속할 수 없음
  final void finalMethod() { // final 메서드는 하위 클래스에서 오버라이딩할 수 없음
    // ...
  }
}