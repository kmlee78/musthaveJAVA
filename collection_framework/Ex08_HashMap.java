import java.util.HashMap;
import java.util.Set;

public class Ex08_HashMap {

  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // 데이터 추가
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);
    map.put("four", 4);

    Set<String> keys = map.keySet(); // key를 담고 있는 컬렉션 객체 생성
    for (String key : keys) {
      System.out.println(map.get(key)); // 1 2 3 4 데이터 탐색
    }

    map.remove("two"); // key가 "two"인 데이터 삭제
  }
}
