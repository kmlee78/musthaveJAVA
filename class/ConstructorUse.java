class Book {

  String title;
  int price;
  int num = 0;

  Book() { // 디폴트 생성자에 기능 부여
    title = "자바의 정석";
    price = 30000;
  }

  Book(String t, int p) { // 생성자 오버로딩
    title = t;
    price = p;
  }
}

public class ConstructorUse {

  public static void main(String[] args) {
    Book book1 = new Book(); // 디폴트 생성자 사용
    Book book2 = new Book("자바의 정석", 30000); // 오버로딩된 생성자 사용
  }
}
