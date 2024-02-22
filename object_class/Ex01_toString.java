class Book {
    String author;
    public String toString() { // 메서드 오버라이딩을 통해 print 시 원하는 값 출력
        return "Book: " + author;
    }
}

public class Ex01_toString {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "홍길동";
        System.out.println(book); // Book: 홍길동
    }
}
```