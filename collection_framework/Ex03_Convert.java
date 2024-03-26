import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03_Convert {

  public static void main(String[] args) {
    // 매개변수로 전달된 객체들을 저장한 컬렉션 객체 생성
    // 이렇게 생성된 리스트 객체는 요소를 추가, 삭제할 수 없다.
    List<String> list = Arrays.asList("Java", "C++", "Python", "C#");
    list = new ArrayList<>(list); // 수정 가능한 리스트로 변환
    list.add("JavaScript");

    // 객체의 순환
    for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
      System.out.print(iter.next() + " "); // Java C++ Python C# JavaScript
    }

    // ArrayList<E>를 LinkedList<E>로 변환
    list = new LinkedList<>(list);
  }
}
