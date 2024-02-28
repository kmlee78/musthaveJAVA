enum Human {
  MAN,
  WOMAN,
}

enum Machine {
  TANK,
  AIRPLANE,
}

public class Ex01_Enum {

  public static void main(String[] args) {
    createUnit(Machine.TANK);
    createUnit(Human.MAN); // 잘못된 상수 사용
  }

  public static void createUnit(Machine type) {
    switch (type) {
      case TANK:
        System.out.println("Tank");
        break;
      case AIRPLANE:
        System.out.println("Airplane");
        break;
    }
  }
}
