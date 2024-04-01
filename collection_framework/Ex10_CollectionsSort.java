import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringDesc implements Comparator<String> {

  public int compare(String o1, String o2) {
    return o2.compareTo(o1);
  }
}

public class Ex10_CollectionSort {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");

    // 정렬: 오름차순
    Collections.sort(list);
    System.out.println(list); // four, one, three, two

    StringDesc cmp = new StringDesc();

    // 정렬: 내림차순
    Collections.sort(list, cmp);
    System.out.println(list); // two, three, one, four
  }
}
