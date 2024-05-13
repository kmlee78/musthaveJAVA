import java.util.Arrays;
import java.util.List;

public class Ex05_Reduce {

  public static void main(String[] args) {
    // reduce() 메서드는 스트림의 요소를 줄여나가면서 연산을 수행
    // 초기값이 있으면 초기값부터 시작하고 없으면 스트림의 첫 번째 요소부터 시작
    // 연산의 결과가 다음 요소와 함께 다시 연산되는 방식
    List<String> list1 = Arrays.asList("java", "backend", "best", "course");

    String name1 = list1
      .stream()
      .reduce("python", (s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
    System.out.println(name1); // backend

    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

    int sum = list2.stream().reduce(0, (n1, n2) -> n1 + n2);
    System.out.println(sum); // 15
  }
}
