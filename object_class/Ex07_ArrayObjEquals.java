import java.util.Arrays;

class INum {

  private int num;

  public INum(int num) {
    this.num = num;
  }

  @Override // Object 클래스의 equals 메서드를 재정의
  public boolean equals(Object obj) {
    if (this.num == ((INum) obj).num) {
      return true;
    } else {
      return false;
    }
  }
}

public class Ex07_ArrayObjEquals {

  public static void main(String[] args) {
    INum[] ar1 = new INum[2];
    INum[] ar2 = new INum[2];

    ar1[0] = new INum(1);
    ar2[0] = new INum(1);

    ar1[1] = new INum(2);
    ar2[1] = new INum(2);

    System.out.println(Arrays.equals(ar1, ar2)); // true
    // INum에 equals메소드를 오버라이드 해줬기 때문에
    // Arrays.equals 메소드를 사용하여 배열의 내용을 비교할 수 있다.
  }
}
