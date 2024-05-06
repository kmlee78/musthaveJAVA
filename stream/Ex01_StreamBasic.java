import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01_StreamBasic {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    // 스트림 생성
    IntStream stm = Arrays.stream(arr);

    // 중간 연산
    IntStream stm2 = stm.filter(n -> n % 2 == 1);

    // 최종 연산
    int sum = stm2.sum();

    // 파이프라인을 이용한 스트림 생성
    int sum2 = Arrays.stream(arr).filter(n -> n % 2 == 1).sum();
    System.out.println(sum); // 9

    // ForEach문을 이용한 출력
    Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    // 1 2 3 4 5
  }
}
