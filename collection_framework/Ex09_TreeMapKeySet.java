import java.util.TreeMap;

public class Ex09_TreeMapKeySet {

  public static void main(String[] args) {
    TreeMap<String, Integer> map = new TreeMap<>();

    // 데이터 추가
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);
    map.put("four", 4);

    // key들이 정렬된 상태로 출력된다.
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key); // four, one, three, two
    }
  }
}
