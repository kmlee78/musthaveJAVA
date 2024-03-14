class MyData {

  // 메서드 하나에 대해서도 제네릭을 사용할 수 있다.
  public static <T> T showData(T data) {
    if (data instanceof String) {
      System.out.println("String: " + data);
    } else if (data instanceof Integer) {
      System.out.println("Integer: " + data);
    } else if (data instanceof Double) {
      System.out.println("Double: " + data);
    }
    return data;
  }
}

public class Ex04_GenericMethod {

  public static void main(String[] args) {
    MyData.<String>showData("Hello"); // String: Hello
    MyData.showData(10); // Integer: 10 <Integer>는 생략 가능
    MyData.showData(10.0); // Double: 10.0 <Double>는 생략 가능
  }
}
