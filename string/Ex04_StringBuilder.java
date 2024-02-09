public class Ex04_StringBuilder {

  public static void main(String[] args) {
    // StringBuilder를 사용하면 문자열을 연결하거나 변경할 때 새로운 객체를 생성하지 않고 기존의 데이터를 변경한다.
    // 기능적으로 동일한 StringBuffer 클래스도 있지만, StringBuilder 클래스가 더 빠르다.
    // 스레드 안정성이 필요한 경우에는 StringBuffer를 사용한다.
    StringBuilder buf = new StringBuilder("동해물과");

    buf.append("백두산이");
    System.out.println(buf); // 동해물과백두산이

    buf.append(123);
    System.out.println(buf); // 동해물과백두산이123

    buf.delete(0, 4); // 문자열에서 특정 범위의 문자를 삭제
    System.out.println(buf); // 백두산이123

    buf.replace(0, 2, "서울"); // 문자열에서 특정 범위의 문자를 다른 문자로 대치
    System.out.println(buf); // 서울두산이123

    buf.reverse(); // 문자열을 역순으로 변경
    System.out.println(buf); // 321이산두울서
  }
}
