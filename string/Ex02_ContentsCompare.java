public class Ex02_ContentsCompare {

  public static void main(String[] args) {
    String str1 = new String("Apple");
    String str2 = new String("apple");
    String str3 = new String("Banana");
    int cmp;

    if (str1.equals(str2)) { // 문자열이 같은지 비교
      System.out.println("str1과 str2는 같다.");
    } else {
      System.out.println("str1과 str2는 다르다.");
    }

    cmp = str1.compareTo(str2); // 대소문자를 구분하여 사전순 비교
    if (cmp == 0) {
      System.out.println("str1과 str2는 같다.");
    } else if (cmp < 0) {
      System.out.println("str1은 str2보다 사전적으로 앞에 있다.");
    } else {
      System.out.println("str1은 str2보다 사전적으로 뒤에 있다.");
    }

    cmp = str1.compareToIgnoreCase(str2); // 대소문자를 구분하지 않고 비교
    if (cmp == 0) {
      System.out.println("str1과 str2는 같다.");
    } else {
      System.out.println("str1과 str2는 다르다.");
    }
  }
}
