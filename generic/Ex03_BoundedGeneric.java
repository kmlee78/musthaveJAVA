// 상속 관계를 표시하여 매개변수의 타입을 제한
class Camp<T extends Number> {

  private T unit;

  public void setUnit(T unit) {
    this.unit = unit;
  }

  public T getUnit() {
    return unit.intValue(); // intValue()는 Number 클래스의 메서드
  }
}

public class Ex03_BoundedGeneric {

  public static void main(String[] args) {
    Camp<Integer> camp = new Camp<>();
    camp.setUnit(10);
    System.out.println(camp.getUnit()); // 10
  }
}
