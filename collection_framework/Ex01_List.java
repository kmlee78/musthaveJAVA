// List<E> 인터페이스를 구현한 클래스 중 하나인 ArrayList<E>
import java.util.ArrayList;
// List<E> 인터페이스를 구현한 클래스 중 하나인 LinkedList<E>
import java.util.LinkedList;
import java.util.List;

public class Ex01_List {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new LinkedList<String>();

    // 객체 저장. 순서대로 저장됨
    // LinkedList가 ArrayList보다 객체 추가, 삭제에 빠르다.
    list1.add("Java");
    list1.add("C++");
    list2.add("Python");
    list2.add("C#");

    // 객체 참조
    // ArrayList가 LinkedList보다 객체 참조에 빠르다.
    for (int i = 0; i < list1.size(); i++) {
      System.out.print(list1.get(i) + " "); // Java C++
      System.out.print(list2.get(i) + " "); // Python C#
    }

    list1.remove(0); // 세 번째 객체 삭제
    list2.remove(1); // 두 번째 객체 삭제
  }
}
