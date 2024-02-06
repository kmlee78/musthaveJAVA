import java.util.Random;

public class Ex02_Preload {

  static int num;

  // static 초기화 블록. main()보다 먼저 실행됨
  static {
    Random random = new Random();
    // main()이 실행되기 전에 num에 랜덤값을 저장
    num = random.nextInt(100);
  }

  public static void main(String[] args) {
    System.out.println(num);
  }
}
