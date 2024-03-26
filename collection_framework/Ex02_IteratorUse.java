import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02_IteratorUse {

  public static void main(String[] args) {
    List<String> list = new LinkedList<String>();

    list.add("Java");
    list.add("C++");
    list.add("Python");
    list.add("C#");

    // 반복자 생성
    Iterator<String> iter = list.iterator();

    // 반복자를 이용한 순차적 참조
    String str;
    while (iter.hasNext()) { // hasNext()로 요소 존재 여부 확인
      str = iter.next(); // next()로 요소 참조
      System.out.print(str + " "); // Java C++ Python C#
      if (str.equals("Java")) iter.remove(); // remove()로 요소 삭제
    }

    iter = list.iterator();
    while (iter.hasNext()) {
      System.out.print(iter.next() + " "); // C++ Python C#
    }
  }
}
