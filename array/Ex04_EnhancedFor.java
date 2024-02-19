class House {

  private String name;

  public House(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class Ex04_EnhancedFor {

  public static void main(String[] args) {
    // for each문을 사용하여 배열의 모든 요소를 출력
    int[] arr1 = { 1, 2, 3, 4, 5 };
    for (int num : arr1) {
      System.out.print(num + " "); // 1 2 3 4 5
    }

    House[] arr2 = {
      new House("홍길동"),
      new House("이순신"),
      new House("세종대왕"),
    };
    for (House house : arr2) {
      System.out.print(house.getName() + " "); // 홍길동 이순신 세종대왕
    }
  }
}
