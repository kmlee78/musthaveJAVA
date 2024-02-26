import java.util.Arrays;

class Person implements Comparable {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public int compareTo(Object obj) { // Comparable 인터페이스의 compareTo 메소드 재정의
    Person p = (Person) obj;
    int result = this.name.compareTo(p.name);
    return result;
  }
}

public class Ex08_ArrayObjSort {

  public static void main(String[] args) {
    Person[] ar = new Person[3];
    ar[0] = new Person("Lee");
    ar[1] = new Person("Park");
    ar[2] = new Person("Kim");

    Arrays.sort(ar); // Person에 구현된 compareTo 메소드를 이용하여 정렬
    for (Person p : ar) {
      System.out.println(p); // Kim, Lee, Park
    }
  }
}
