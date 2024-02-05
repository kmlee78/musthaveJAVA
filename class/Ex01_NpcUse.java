class Npc {

  String name;
  int hp;

  void say() {
    System.out.println("안녕하세요.");
  }
}

public class Ex01_NpcUse {

  public static void main(String[] args) {
    Npc npc = new Npc();
    npc.name = "홍길동"; // 멤버 변수에 직접 접근
    npc.hp = 100; // 멤버 변수에 직접 접근
    npc.say(); // 메서드 호출
  }
}
