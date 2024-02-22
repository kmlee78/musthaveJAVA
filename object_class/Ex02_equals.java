class Book {

  String author;

  public boolean equals(Object obj) { // 메서드 오버라이딩을 통해 equals 메서드 재정의
    if (obj instanceof Book) {
      Book book = (Book) obj;
      return this.author.equals(book.author);
    } else {
      return false;
    }
  }
}

public class Ex02_equals {

  public static void main(String[] args) {
    Book book1 = new Book();
    book1.author = "홍길동";
    Book book2 = new Book();
    book2.author = "홍길동";
    System.out.println(book1.equals(book2)); // true
  }
}
