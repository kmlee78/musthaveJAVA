// Set<E> 인터페이스를 구현한 TreeSet<E> 클래스. 결괏값이 정렬되어 출력된다.
import java.util.Set;
import java.util.TreeSet;

class Lang implements Comparable<Lang> {

  private String name;

  public Lang(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int compareTo(Lang other) { // compareTo를 오버라이드하여 객체의 정렬 기준을 정한다.
    return this.name.compareTo(other.name);
  }
}

public class Ex05_TreeSet {

  public static void main(String[] args) {
    Set<Lang> set = new TreeSet<>();
    set.add(new Lang("Java"));
    set.add(new Lang("C++"));
    set.add(new Lang("Python"));
    set.add(new Lang("Java"));
    set.add(new Lang("C++"));

    for (Lang lang : set) {
      System.out.println(lang.getName()); // C++, Java, Python
    }
  }
}
