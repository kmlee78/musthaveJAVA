import java.util.stream.IntStream;

public class Ex04_PreTerminal {

  public static void main(String[] args) {
    // 합
    int sum = IntStream
      .of(1, 2, 3, 4, 5) // of() 메서드로 숫자를 직접 입력해 스트림 생성
      .sum();
    System.out.println(sum); // 15

    // 개수
    long count = IntStream.of(1, 2, 3, 4, 5).count();
    System.out.println(count); // 5

    // 평균. 따로 변수에 저장하지 않고 결과가 존재하면 출력
    IntStream.of(1, 2, 3, 4, 5).average().ifPresent(a -> System.out.println(a)); // 3.0

    // 최대값
    IntStream.of(1, 2, 3, 4, 5).max().ifPresent(m -> System.out.println(m)); // 5

    // 최소값
    IntStream.of(1, 2, 3, 4, 5).min().ifPresent(m -> System.out.println(m)); // 1
  }
}
