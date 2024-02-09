import com.company.Circle;

public class Ex02_ImportUse {

  public static void main(String[] args) {
    // 임프토한 클래스는 패키지명 없이 클래스명만으로 접근 가능
    Circle c = new Circle(5.0);
    System.out.println(c.getArea());
  }
}
