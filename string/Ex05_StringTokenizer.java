public class Ex05_StringTokenizer {

  public static void main(String[] args) {
    String str = "사과,바나나,딸기,포도";
    // StringTokenizer 클래스는 문자열을 지정된 구분자로 분리하는데 사용
    StringTokenizer st = new StringTokenizer(str, ","); // 두번째 인자를 생략하면 공백을 기본 구분자로 사용

    while (st.hasMoreTokens()) { // 토큰 유무 확인
      // 토큰을 반환하고 다음 토큰으로 이동
      System.out.println(st.nextToken()); // 사과 바나나 딸기 포도
    }
  }
}
