import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex12_CollectionsCopy {

  public static void main(String[] args) {
    List<String> src = Arrays.asList("one", "two", "three", "four");
    // 수정 가능한 리스트 생성
    List<String> dest = new ArrayList<>(src);

    // 정렬 후 출력
    Collections.sort(dest);
    System.out.println(dest); // four, one, three, two

    // dest에 src의 모든 요소를 복사한다.
    Collections.copy(dest, src);

    // 다시 원래대로 돌아옴
    System.out.println(dest); // one, two, three, four
  }
}
