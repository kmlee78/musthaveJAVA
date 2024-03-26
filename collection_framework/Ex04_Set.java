// Set<E> 인터페이스를 구현한 HashSet<E> 클래스
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Lang {

  private String name;

  public Lang(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int hashCode() { // hasCode를 오버라이드하여 객체의 중복을 판단한다.
    return this.name;
  }
}

public class Ex04_Set {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add(new Lang("Java"));
    set.add(new Lang("C++"));
    set.add(new Lang("Python"));
    set.add(new Lang("Java"));
    set.add(new Lang("C++"));

    System.out.println("Size of set: " + set.size()); // 3

    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next()); // Java, C++, Python
    }
  }
}
