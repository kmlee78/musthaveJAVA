public class Ex04_BoxingUnboxing {

  public static void main(String[] args) {
    // 박싱
    Integer iObj = integer.valueOf(100);
    Double dObj = double.valueOf(3.14);

    // 언박싱
    int num1 = iObj.intValue();
    double num2 = dObj.doubleValue();

    // 래퍼 인스턴스 값의 증가
    iObj = Integer.valueOf(iObj.intValue() + 100);
    dObj = Double.valueOf(dObj.doubleValue() + 1.2);
    System.out.println(iObj); // 200
    System.out.println(dObj); // 4.34

    // 오토 박싱
    Integer num = 100;
    Double num3 = 3.14;

    // 오토 언박싱
    int num4 = num;
    double num5 = num3;
  }
}
