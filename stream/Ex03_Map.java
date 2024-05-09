import java.util.Arrays;
import java.util.List;

public class Ex03_Map {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("apple", "banana", "grape");

    // map()은 스트림을 구성하는 데이터를 조건에 따라 변환하는 연산을 수행한다.
    list
      .stream()
      .map(s -> s.toUpperCase())
      .forEach(s -> System.out.print(s + " "));
    // APPLE BANANA GRAPE
  }
}
