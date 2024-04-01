// 이진 탐색을 하려면 데이터가 먼저 정렬되어 있어야 한다.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11_CollectionSearch {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");

    Collections.sort(list); // 오름차순 정렬

    // 이진 탐색
    int idx = Collections.binarySearch(list, "three");
    System.out.println(idx); // 2

    idx = Collections.binarySearch(list, "five");
    System.out.println(idx); // -1 (찾지 못한 경우 음수 반환)
  }
}
