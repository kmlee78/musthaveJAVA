import java.util.Random;

public class Ex06_RandomUse {

  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      System.out.println(random.nextInt(10)); // 0에서 9까지의 난수 출력
    }

    Random random2 = new Random(100); // 시드값을 설정하여 매번 같은 난수 출력
  }
}
