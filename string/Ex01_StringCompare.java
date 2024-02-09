// == 연산자는 문자열이 같은 객체인지 아닌지를 비교한다.

public class Ex01_StringCompare {

  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello"; // 새로운 객체를 생성하지 않고 str1에서 만든 기존 객체를 참조
    String str3 = new String("Hello");
    String str4 = new String("Hello");

    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false
    System.out.println(str3 == str4); // false
  }
}
