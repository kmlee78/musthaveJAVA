public class Ex03_StringMethod {

  public static void main(String[] args) {
    String str1 = "기초";
    String str2 = "자바";
    String str3 = str1.concat(str2); // 문자열을 연결하여 새로운 문자열을 생성
    System.out.println(str3); // 기초자바

    String str4 = "AppleBananaOrange";
    int num1 = str4.indexOf("a"); // 문자열에서 특정 문자열이 처음으로 나타나는 위치를 반환
    int num2 = str4.indexOf("a", num1 + 1); // 첫 a 다음부터 다음 a를 찾음
    System.out.println(num1); // 6

    int num3 = str4.indexOf("Banana"); // Banana가 처음으로 나타나는 위치를 반환
    int num4 = str4.indexOf("Orange"); // Orange가 처음으로 나타나는 위치를 반환
    String str5 = str4.substring(num3, num4); // 문자열에서 특정 범위의 문자열을 추출
    String str6 = str4.substring(num4); // 문자열에서 특정 위치부터 끝까지의 문자열을 추출
    System.out.println(str5); // Banana
    System.out.println(str6); // Orange

    System.out.println(str4.length()); // 문자열의 길이를 반환
    System.out.println(str4.charAt(2)); // p, 문자열에서 특정 위치의 문자를 반환

    double num5 = 123.456;
    String str7 = String.valueOf(num5); // 숫자를 문자열로 변환
  }
}
