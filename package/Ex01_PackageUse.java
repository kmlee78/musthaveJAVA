public class Ex01_PackageUse {

  public static void main(String[] args) {
    // 패키지명.클래스명으로 접근
    com.company.Circle c = new com.company.Circle(5.0);
    System.out.println(c.getArea());
  }
}
